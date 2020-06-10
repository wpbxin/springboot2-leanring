package com.wpbxin.learning.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppWithBanner {
	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(SpringApp.class);
		application.setBanner(new MyBanner());
		application.run(args);
	}
}