package com.rbac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
