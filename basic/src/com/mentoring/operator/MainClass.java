package com.mentoring.operator;

public class MainClass {

    public static void main(String[] args) {
        ArithmeticOperator arithmeticOperator = new ArithmeticOperator();
        int addition = arithmeticOperator.addition(2, 4);
        int subtraction = arithmeticOperator.subtraction(4, 3);
        int multiplication = arithmeticOperator.multiplication(3, 5);
        int division = arithmeticOperator.division(6, 3);
        int modulus = arithmeticOperator.modulus(7, 3);
        int increment = arithmeticOperator.increment(4);
        int decrement = arithmeticOperator.decrement(4);

        System.out.println("----------------- Arithmetic Operators --------------------------");
        System.out.println("Addition (2 + 4) -> " + addition);
        System.out.println("Subtraction (4 - 3) -> " + subtraction);
        System.out.println("Multiplication (3 * 5) -> " + multiplication);
        System.out.println("Division (6 / 3) -> " + division);
        System.out.println("Modulus (7 % 3) -> " + modulus);
        System.out.println("Increment 4 -> " + increment);
        System.out.println("Decrement 4 -> " + decrement);
    }
}
