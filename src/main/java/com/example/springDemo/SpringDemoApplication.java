package com.example.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
* Main class of the spring application*/
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		/*
		* Running the spring application using the run() and getting back the
		* the instance of ApplicationContext by which we use it to get the bean
		* from the application context.*/
		ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);

		/*Getting the bean of ClassManager type to call the methods of the
		* ClassManager class.*/
		ClassManager classManager = applicationContext.getBean(ClassManager.class);
		classManager.printMessage();
		// returning the property of ClassManager class
		System.out.println(classManager.getMethodManager());
	}

}
