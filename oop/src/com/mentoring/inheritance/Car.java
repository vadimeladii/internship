package com.mentoring.inheritance;

public class Car extends Vehicle {

    private String modelName = "Mustang";    // Car attribute

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
