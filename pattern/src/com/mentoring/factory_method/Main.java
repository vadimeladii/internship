package com.mentoring.factory_method;

public class Main {

    public static void main(String[] args) {
        Animal liza = create("Cat");
        Animal richard = create("Dog");
        Animal carl = create("Pig");
        System.out.println(liza);
        System.out.println(richard);
        System.out.println(carl);
    }

    public static Animal create(String type) {
        Animal animal = null;

        switch (type) {
            case "Cat":
                animal = new Cat("Liza", 20D, 500D);
                break;
            case "Dog":
                animal = new Dog("Richard", 50D, 4000D);
                break;
            case "Pig":
                animal = new Pig("Carl", 70D, 100000D);
                break;
        }

        return animal;
    }
}
