package com.example.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.dao")
public class DemoDaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDaoApplication.class, args);
	}

}
