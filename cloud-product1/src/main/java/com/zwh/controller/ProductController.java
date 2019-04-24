package com.zwh.controller;

import com.zwh.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("name")
    public String name(String name){
        return "product1"+name;
    }
    @RequestMapping("hi")
    public String hi(@RequestParam("name") String name){
        return "product1"+name;
    }
    @RequestMapping("queryUser")
    public String queryUser(@RequestBody User user){
        return "product1"+user;
    }
    @RequestMapping("hystrix")
    public String testFallback(String name){
        User user=new User();
        user.setName(name);
        return "product1"+user;
    }
}
