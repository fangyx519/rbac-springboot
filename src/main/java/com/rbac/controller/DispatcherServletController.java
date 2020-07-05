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

    @GetMapping("/deptAdd")
    public String deptAdd(){
        return "dept-add";
    }

    @GetMapping("/deptEdit")
    public String deptEdit(){
        return "dept-edit";
    }

    // ********** role **************
    @GetMapping("/roleManager")
    public String role(){
        return "roleManager";
    }

    @GetMapping("/roleAdd")
    public String roleAdd(){
        return "role-add";
    }

    @GetMapping("/roleEdit")
    public String roleEdit(){
        return "role-edit";
    }

    // ********** menu **************
    @GetMapping("/menuManager")
    public String menu(){
        return "menuManager";
    }

    @GetMapping("/menuAdd")
    public String menuAdd(){
        return "menu-add";
    }

    @GetMapping("/menuEdit")
    public String menuEdit(){
        return "menu-edit";
    }

    // ********** auth **************
    @GetMapping("/resManager")
    public String resources(){
        return "resManager";
    }

    @GetMapping("/resAdd")
    public String resAdd(){
        return "res-add";
    }

    @GetMapping("/resEdit")
    public String resEdit(){
        return "res-edit";
    }

    // ********** log **************
    @GetMapping("/logManager")
    public String log(){
        return "logManager";
    }

}
