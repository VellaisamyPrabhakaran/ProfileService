package com.vellaisamy.prabhakaran.services.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vellaisamy.prabhakaran.services.controllers")
public class Starter {
	
	public static void main(String[] args) {
		 SpringApplication.run(Starter.class, args);
	}

}
