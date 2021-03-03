package com.example.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassManager {
    @Autowired
    private MethodManager methodManager;

    public ClassManager(MethodManager methodManager) {
        this.methodManager = methodManager;
    }

    public void printMessage()
    {
        methodManager.print();
    }


}
