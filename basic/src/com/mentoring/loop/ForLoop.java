package com.mentoring.loop;

public class ForLoop {

    public static void main(String[] args) {

/*
        for (statement 1; statement 2; statement 3) {
            // code block to be executed
        }
*/

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------------------");

/*
        for (type variable : arrayname) {
            // code block to be executed
        }
*/
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
