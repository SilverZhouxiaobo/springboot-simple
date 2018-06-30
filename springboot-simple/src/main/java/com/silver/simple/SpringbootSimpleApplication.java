package com.silver.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.silver.simple.web")
public class SpringbootSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSimpleApplication.class, args);
	}
}
