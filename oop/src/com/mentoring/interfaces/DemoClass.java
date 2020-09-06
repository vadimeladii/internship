package com.mentoring.interfaces;

// DemoClass "implements" FirstInterface and SecondInterface
public class DemoClass implements FirstInterface, SecondInterface {

    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}
