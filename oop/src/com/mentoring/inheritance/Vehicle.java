package com.mentoring.inheritance;

public class Vehicle {

    protected String brand = "Ford";         // Vehicle attribute

    public void honk() {                     // Vehicle method
        System.out.println("Tuut, tuut!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
