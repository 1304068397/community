package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.mapper")
public class WangStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WangStudyApplication.class, args);
	}

}