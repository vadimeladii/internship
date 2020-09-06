package com.mentoring.modifier;

public class Circle {

    final String color;
    public int radius;

    private double PI = 3.14159;


    public Circle(String color) {
        this.color = color;
    }

    static String myStaticMethod() {
        return "Static methods can be called without creating objects";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
