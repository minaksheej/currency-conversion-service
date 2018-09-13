package com.spring.integration.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.GreeterService;

@SpringBootApplication
public class IntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationApplication.class, args);
		 ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext( "applicationContext.xml" );
		 GreeterService greeterService=applicationContext.getBean("greeterServiceImpl",GreeterService.class);
		 greeterService.greet("g");
		 
	}
}
