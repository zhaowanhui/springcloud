package com.zwh.controller;

import com.zwh.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("name")
    public String name(String name){
        return "product2"+name;
    }
    @RequestMapping("/hystrix_feign")
    public String hi(User user){
        System.out.println("555");
        return "product2"+user;
    }
}
