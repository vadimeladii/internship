package com.mentoring.factory_method;

public class Pig extends Animal {

    public Pig(String name, Double height, Double weight) {
        super(name, height, weight);
    }

    @Override
    public String sound() {
        return "OINK OINK OINK";
    }
}
