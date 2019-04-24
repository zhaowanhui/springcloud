package com.zwh.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zwh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * Description:远程调用测试
     */
    @RequestMapping("/hello")
    public String hello(String name){
       String forObject = restTemplate.getForObject("http://PRODUCT/product/name?name="+name, String.class);
        return forObject;
    }
    /**
     *  Hystrix容错测试用
     */
    @HystrixCommand(fallbackMethod = "testFallback")//开启容错
    @RequestMapping("/hystrix")
    public String hi(String name) {
        String restTemplateForObject = restTemplate.getForObject("http://PRODUCT/product/hystrix?name=" + name, String.class);
        return restTemplateForObject;
    }
    //当请求出现错误时，返回此方法
    public String testFallback(String name){
        User user=new User();
        user.setName(name);
        user.setAge(-1);
        return user.toString();
    }

}
