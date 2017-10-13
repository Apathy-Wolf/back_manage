package com.wolf.back_manage.web;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;


@Controller
public class LoginController {

    @RequestMapping("/loginHtml")
    public String loginHtml(){
        return "/loginhtml/login";
    }
}
