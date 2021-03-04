package com.example.springDemo;

/*
* We're creating a MethodManager interface which has print()
* which is then overriden by both PrimaryClass And SecondaryClass
* we're using this interface to make the code loosely coupled
* by using the instance of MethodManager class to decide
* print method of which class should be called.*/
public interface MethodManager {
    void print();
}
