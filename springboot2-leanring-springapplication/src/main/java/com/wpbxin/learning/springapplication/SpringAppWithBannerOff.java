package com.wpbxin.learning.springapplication;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppWithBannerOff {
	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(SpringApp.class);
		application.setBanner(new MyBanner());
		// 关闭掉 banner
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}