package com.example.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @Authhor zhangren
 * dataTime 2019-03-22 4:06 PM
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.example.dao"})
@ComponentScan(basePackages = {"com.example.service"})
public class DemoServiceImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceImplApplication.class, args);
    }
}
