package com.llllluuusa.boot.autoconfigure.middleware;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("llllluuusa.custom")
public class MiddleWareProperties {
    /**
     * 自定义参数的注解
     */
    private String properties = "自定义参数";
}
