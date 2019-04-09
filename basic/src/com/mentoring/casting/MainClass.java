package com.mentoring.casting;

public class MainClass {

/*
    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte
*/

    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = 9.8D;

        double myDoubleCast = myInt;    // Automatic casting: int to double
        int myIntCast = (int) myDouble; // Manual casting: double to int

        System.out.println(myDoubleCast);   // Outputs 9.0
        System.out.println(myIntCast);      // Outputs 9
    }
}
