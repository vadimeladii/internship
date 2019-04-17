package com.mentoring.inheritance;

public class MainClass {

/*
    In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

        * subclass (child) - the class that inherits from another class
        * superclass (parent) - the class being inherited from

    To inherit from a class, use the 'extends' keyword.
*/

    public static void main(String[] args) {
        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.getBrand() + " " + myCar.getModelName());

    }
}
