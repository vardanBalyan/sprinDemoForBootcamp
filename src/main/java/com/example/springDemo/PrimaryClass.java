package com.example.springDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
* This is the PrimaryClass which is implementing the print method
* of MethodManager interface.
*
* Here we're using the @Component annotation to tell the spring
* that this is a bean that the spring has to manage.
*
* By using @Primary annotation we're are specifying to the spring IOC to
* give higher priority to this bean when we have more than one beans
* in the container.*/
@Component
@Primary
public class PrimaryClass implements MethodManager{
    @Override
    public void print() {
        System.out.println("print() method of PrimaryClass got called.");
    }
}
