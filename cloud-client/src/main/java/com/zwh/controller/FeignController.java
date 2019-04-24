package com.zwh.controller;

import com.zwh.entity.User;
import com.zwh.feign.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class FeignController {
    @Autowired
    private FeignTest feignTest;
    @RequestMapping("sayHi")
    public String hi(@RequestParam("name") String name){
        String name1 = feignTest.sayHi(name);
        return name1;
    }
    @RequestMapping("queryUser")
    public String queryUser(User user){
        String user1 = feignTest.queryUser(user);

        return user1;
    }
}
