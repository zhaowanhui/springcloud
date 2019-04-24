package com.zwh.feign;

import com.zwh.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(serviceId = "PRODUCT")
public interface FeignTest {
    @RequestMapping("product/hi")
    String sayHi(@RequestParam("name") String name);
    @RequestMapping(value = "product/queryUser",method = RequestMethod.POST)
    String queryUser(User user);
}
