package com.mentoring.object;

public class MainClass {

/*
    Java is an object-oriented programming language.

    Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object.
    The car has attributes, such as weight and color, and methods, such as drive and brake.
*/

    public static void main(String[] args) {
//        Create an Object
        Car car = new Car();

        System.out.println(car.weight);
        System.out.println("---------------------------------");

//        Multiple Objects
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.weight);
        System.out.println(car2.weight);
        System.out.println("---------------------------------");
    }
}
