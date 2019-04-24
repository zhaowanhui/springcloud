package com.zwh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class Client2Controller {
    @RequestMapping("name")
    public String name(String name){
        return name;
    }
}
