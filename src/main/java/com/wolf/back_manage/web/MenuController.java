package com.wolf.back_manage.web;

import com.wolf.back_manage.domain.Menu;
import com.wolf.back_manage.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MenuController {

    @Autowired private MenuService menuService;

    @RequestMapping("/menu")
    public List<Menu> allMenu(){
        return menuService.findAll();
    }
}
