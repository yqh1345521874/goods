package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"com.example.demo.mapper"})
public class Springboot0801Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot0801Application.class, args);
	}
}
