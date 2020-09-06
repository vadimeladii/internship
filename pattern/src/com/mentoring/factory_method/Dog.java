package com.mentoring.factory_method;

public class Dog extends Animal {

    public Dog(String name, Double height, Double weight) {
        super(name, height, weight);
    }

    @Override
    public String sound() {
        return "WOOF WOOF WOOF";
    }
}
