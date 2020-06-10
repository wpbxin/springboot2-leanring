package com.wpbxin.learning.springapplication;

import java.io.PrintStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

public class MyBanner implements Banner {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyBanner.class);
	
	@Override
	public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
		LOGGER.info("MyBanner test!");
	}

}
