package com.example.springDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PrimaryClass implements MethodManager{
    @Override
    public void print() {
        System.out.println("print() method of PrimaryClass got called.");
    }
}
