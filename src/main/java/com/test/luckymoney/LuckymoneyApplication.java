package com.test.luckymoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //项目启动注解
public class LuckymoneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuckymoneyApplication.class, args);
		System.out.println("hello");
	}

}
