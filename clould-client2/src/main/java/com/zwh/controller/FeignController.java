package com.zwh.controller;

import com.zwh.entity.User;
import com.zwh.feign.FeignTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class FeignController {
    @Autowired
    private FeignTest feignTest;
    @RequestMapping("hi")
    public String hi(User user){
        String name1 = feignTest.sayHi(user);
        return name1;
    }
}
