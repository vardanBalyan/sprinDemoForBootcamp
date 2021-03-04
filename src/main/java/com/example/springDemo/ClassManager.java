package com.example.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
* This is a ClassManager class by which we manage which class instance
* should be called using the MethodManager interface.
*
* In this since we used @component then this task is managed by the
* spring IoC.
*
* We're using @Autowired annotation to tell spring IoC to autowire
* the instance of MethodManager interface either by constructor injection.*/
@Component
public class ClassManager {

    private MethodManager methodManager;  //instance of MethodManager interface

    /*Using constructor of ClassManager class to instantiate the MethodManager
    * which is automatically done by spring
    *
    * With Autowired annotation above the constructor we're using
    * the constructor injection.*/
    @Autowired
    public ClassManager(MethodManager methodManager) {
        this.methodManager = methodManager;
    }

    //getter for methodManager
    public MethodManager getMethodManager() {
        return methodManager;
    }

    /*
    * Using the printMessage method of ClassManager class to
    * call the print() method of whichever class that binds with
    * the instance of MethodManager interface.
    *
    * In this case since we used the PrimaryClass with @Primary
    * annotation then the print() of PrimaryClass should be called.*/
    public void printMessage()
    {
        System.out.println();
        methodManager.print();
    }


}
