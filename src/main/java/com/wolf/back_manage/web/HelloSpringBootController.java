package com.wolf.back_manage.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Boot!";
    }

    @RequestMapping("/hello/{name}")
    public String he(@PathVariable("name")String name){
        return "hello:"+name;
    }
}
