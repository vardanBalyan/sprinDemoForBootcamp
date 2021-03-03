package com.example.springDemo;

import org.springframework.stereotype.Component;

@Component
public class SecondaryClass implements MethodManager{
    @Override
    public void print() {
        System.out.println("print() method of SecondaryClass got called.");
    }
}
