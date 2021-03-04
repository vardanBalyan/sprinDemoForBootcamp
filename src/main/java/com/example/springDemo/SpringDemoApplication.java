package com.example.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		ClassManager classManager = applicationContext.getBean(ClassManager.class);
		//applicationContext.getEnvironment().getProperty();
		classManager.printMessage();
		System.out.println(classManager.getMethodManager());
	}

}
