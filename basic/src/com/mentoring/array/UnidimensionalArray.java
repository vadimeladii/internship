package com.mentoring.array;

public class UnidimensionalArray {

//    To declare an array, define the variable type with square brackets:

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

//        access the elements of an array
        System.out.println(cars[0]); // outputs Volvo
        System.out.println("----------------------");

//        change an array element
        cars[0] = "Opel";
        System.out.println(cars[0]); // outputs Opel
        System.out.println("----------------------");

//        array length
        System.out.println(cars.length);
        System.out.println("----------------------");

//        loop through an array with FOR
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("----------------------");

//        loop through an array with FOR-EACH
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("----------------------");

    }
}
