package com.rbac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fang.yixin
 * @description 页面
 * @date 2020/6/19
 */
@Controller
@RequestMapping("/page")
public class DispatcherServletController {

    @GetMapping("/account")
    public String account(){
        return "account";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/accountAdd")
    public String accountAdd(){
        return "account-add";
    }

    @GetMapping("/accountEdit")
    public String accountEdit(){
        return "account-edit";
    }

    // ********** department **************
    @GetMapping("/deptManager")
    public String department(){
        return "deptManager";
    }

    // ********** role **************
    @GetMapping("/roleManager")
    public String role(){
        return "roleManager";
    }

    // ********** menu **************
    @GetMapping("/menuManager")
    public String menu(){
        return "menuManager";
    }

    // ********** auth **************
    @GetMapping("/authManager")
    public String auth(){
        return "authManager";
    }

}
