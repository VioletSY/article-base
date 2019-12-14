package com.googosoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.googosoft.dao")
@SpringBootApplication
public class BaseApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }
 
}