package com.zwh.conf;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:这是一个feign日志配置类
 */
@Configuration
public class FeignConf {
    @Bean
    public Logger.Level getFeignLog(){
        return Logger.Level.FULL;
    }
}
