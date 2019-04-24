package com.zwh.feign;

import com.zwh.entity.User;
import org.springframework.stereotype.Component;

@Component
public class FeignClientFallBack implements FeignTest {

    @Override
    public String sayHi(User user) {
        return "Hystrix method is invoke";
    }
}
