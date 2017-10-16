package com.wolf.back_manage.web;

import com.wolf.back_manage.domain.Menu;
import com.wolf.back_manage.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired private MenuService menuService;

    @RequestMapping("/test")
    public String test(Model model){
        List<Menu> menuList = menuService.findAll();
        model.addAttribute("menuList",menuList);
        return "/login";
    }

    @RequestMapping("/test/test")
    public String index(){
        return "/test";
    }

    @RequestMapping("/loginToIndex/{username}&{password}")
    public String loginToIndex(@PathVariable("username")String username,@PathVariable("password")String password){
        System.out.print(username+password);
        return "/index";
    }

    @RequestMapping("/testLoginToIndex")
    public String loginToIndex(){
        return "/index";
    }
}
