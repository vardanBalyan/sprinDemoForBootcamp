package com.example.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		//ClassManager classManager = new ClassManager(new SecondaryClass());
		//classManager.printMessage();
		ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		ClassManager classManager = applicationContext.getBean(ClassManager.class);
		classManager.printMessage();
	}

}
