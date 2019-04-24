package com.zwh.feign;

import com.zwh.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(serviceId = "PRODUCT",fallback = FeignClientFallBack.class)
public interface FeignTest {
    @RequestMapping(value = "product/hystrix_feign",method = RequestMethod.POST)
    String sayHi(User user);
}
