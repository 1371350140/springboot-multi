package com.example.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.dao"})
@ComponentScan(basePackages = {"com.example.app", "com.example.service", "com.example.service.impl"})
public class DemoAppApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoAppApplication.class);
    }
}
