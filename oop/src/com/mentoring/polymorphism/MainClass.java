package com.mentoring.polymorphism;

import java.util.List;

public class MainClass {

/*
    Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

    Inheritance lets us inherit attributes and methods from another class.
    Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
*/

    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        System.out.println("---------------------------------");

//        or

        List<Animal> animals = List.of(myPig, myDog);
        animals.forEach(Animal::animalSound);
        System.out.println("---------------------------------");
    }
}
