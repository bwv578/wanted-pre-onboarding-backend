package com.wanted.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.wanted.mappers.UserMapperInter;
import com.wanted.models.user.UserDAO;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wanted.application", "com.wanted.controllers", "com.wanted.models"})
@MapperScan(basePackages = {"com.wanted.mappers"})
public class WantedApplication {

	public static void main(String[] args) {
		SpringApplication.run(WantedApplication.class, args);
	}

}
