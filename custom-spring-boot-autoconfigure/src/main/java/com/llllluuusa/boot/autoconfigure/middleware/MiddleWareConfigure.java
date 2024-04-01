package com.llllluuusa.boot.autoconfigure.middleware;

import com.llllluuusa.framework.middleware.MiddleWareBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MiddleWareProperties.class)
public class MiddleWareConfigure {
    @Bean
    public MiddleWareBean middleWareBean(){
        return new MiddleWareBean();
    }
}
