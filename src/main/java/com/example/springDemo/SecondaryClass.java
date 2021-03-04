package com.example.springDemo;

import org.springframework.stereotype.Component;

/*
 * This is the SecondaryClass which is implementing the print method
 * of MethodManager interface.
 *
 * Here we're using the @Component annotation to tell the spring
 * that this is a bean that the spring has to manage.*/
@Component
public class SecondaryClass implements MethodManager{
    @Override
    public void print() {
        System.out.println("print() method of SecondaryClass got called.");
    }
}
