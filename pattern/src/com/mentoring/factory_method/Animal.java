package com.mentoring.factory_method;

public abstract class Animal {

    private String name;
    private Double height;
    private Double weight;

    public Animal(String name, Double height, Double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public abstract String sound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
