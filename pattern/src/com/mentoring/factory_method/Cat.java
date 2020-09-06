package com.mentoring.factory_method;

public class Cat extends Animal {

    public Cat(String name, Double height, Double weight) {
        super(name, height, weight);
    }

    @Override
    public String sound() {
        return "MEOW MEOW";
    }
}
