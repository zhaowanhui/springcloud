package com.zwh.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConf {
    @Bean
    @LoadBalanced //通过实例名找到IP地址及端口
    public RestTemplate getRestTemp(){
        return new RestTemplate();
    }
}
