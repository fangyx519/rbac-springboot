package com.rbac.controller;

import com.rbac.entity.Role;
import com.rbac.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author fang.yixin
 * @description 角色
 * @date 2020/6/23
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping("/getRoles")
    @ResponseBody
    public List<Role> getRoles(){
        return roleService.selectRoles();
    }
}
