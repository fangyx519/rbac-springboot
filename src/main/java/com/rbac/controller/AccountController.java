package com.rbac.controller;

import com.alibaba.fastjson.JSON;
import com.rbac.entity.*;
import com.rbac.enums.AccountEnum;
import com.rbac.service.AccountService;
import com.rbac.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fang.yixin
 * @description 登录、添加用户、删除用户，停用用户、重置密码、修改用户信息
 * @date 2020/6/18
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 登录：用户名和密码正确且用户状态为正常才可以登录
     * 1、正常登录
     * 2、用户名或密码错误
     * 3、禁止登录，错误次数超过5次
     * 4、停用：禁止登录
     * @param id
     * @param password
     * @return
     */
    public JsonResult login(String id, String password){
        JsonResult jsonResult = new JsonResult();
        Account account = accountService.selectAccountById(id);

        if (!StringUtils.isEmpty(account)){
            jsonResult.setData("登陆成功！");

            if (AccountEnum.DISABLE_LOGIN.getStatus() == account.getUserStatus()){
                jsonResult.setData("该账号已被停用，请联系管理员！");
            }
            if (AccountEnum.FORBID_LOGIN.getStatus() == account.getUserStatus()){
                jsonResult.setData("登录失败超过5次，请联系管理员！");
            }

            boolean checkPassword = MD5Util.checkPassword(password, account.getPassword());
            if (!checkPassword){
                jsonResult.setData("用户名或密码错误！");
                // 判断errorCounts的值，每次加1，如果是4，则加一，同时将status的值改为禁止登录
                int errorCounts = account.getErrorCounts().intValue();
                account.setErrorCounts(account.getErrorCounts() + 1);
                if (errorCounts == 5){
                    account.setUserStatus(AccountEnum.FORBID_LOGIN.getStatus());
                }
                accountService.updateAccount(account);
            }

        }else {
            jsonResult.setData("没有该用户!");
        }

        return jsonResult;
    }

    /**
     * 新增用户相当于新增员工，必须用管理员新增
     * @param
     * @return
     */
    @PostMapping("/addAccount")
    @ResponseBody
    public int addAccount(@RequestBody Map<String,String> data){
        System.out.println(data);
        // 从前端接收到的值
        String userName = data.get("userName");
        int userStatus = Integer.valueOf(data.get("userStatus"));
        long deptId = Long.valueOf(data.get("departmentId"));
        String[] roleIds = data.get("role").split(",");

        // 将接收到的值封装成对象
        Department department = new Department();
        department.setDeptId(deptId);

        List<Role> roleList = new ArrayList<>();

        for (String roleId : roleIds){
            Role role = new Role();
            role.setRoleId(Long.valueOf(roleId));
            roleList.add(role);
        }

        Account account = new Account();
        account.setUserName(userName);
        account.setUserStatus(userStatus);
        account.setDepartment(department);
        account.setRole(roleList);

        accountService.addAccount(account);
        return 1;
    }

    @PostMapping("/editAccount")
    @ResponseBody
    public int editAccount(@RequestBody Map<String,String> data){
        System.out.println(data);

        return 1;
    }

    public JsonResult deleteAccount(String id){
        int deleteAccount = accountService.deleteAccount(id);
        if (deleteAccount == 1){
            return new JsonResult("删除成功!");
        }
        return new JsonResult("删除失败!");
    }

    public JsonResult resetPassword(Account account){
        int updatePassword = accountService.updatePassword(account);
        if (updatePassword == 1){
            return new JsonResult("重置成功!");
        }
        return new JsonResult("重置失败!");
    }

    @PostMapping("/queryAllAccounts")
    @ResponseBody
    public ResponseJson selectAllAccounts(int page, int size) {
        ResponseJson responseJson = new ResponseJson<Account>();
        responseJson.setCode(0);
        responseJson.setMessage("");
        responseJson.setCount(accountService.countAllAccounts());
        responseJson.setData(accountService.selectAllAccounts(page, size));

        return responseJson;
    }

    @GetMapping("/test1")
    public String test1(){
        return "account";
    }
}
