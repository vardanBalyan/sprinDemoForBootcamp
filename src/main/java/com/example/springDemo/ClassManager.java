package com.example.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassManager {

    private MethodManager methodManager;
    @Autowired
    public ClassManager(MethodManager methodManager) {
        this.methodManager = methodManager;
    }

    public MethodManager getMethodManager() {
        return methodManager;
    }

    public void printMessage()
    {
        methodManager.print();
    }


}
