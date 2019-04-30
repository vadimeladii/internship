package com.mentoring.lambda;

public class MainClass {

/*
    Lambda expressions are introduced in Java 8 and are touted to be the biggest feature of Java 8.
    Lambda expression facilitates functional programming, and simplifies the development a lot.

    parameter -> expression body

        * Optional type declaration − No need to declare the type of a parameter.
                The compiler can inference the same from the value of the parameter.

        * Optional parenthesis around parameter − No need to declare a single parameter in parenthesis.
                For multiple parameters, parentheses are required.

        * Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.

        * Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value.
                Curly braces are required to indicate that expression returns a value.
*/

    public static void main(String[] args) {

//        to create an instance of Runnable
        Runnable o = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Runnable");
            }
        };
        o.run();

        Runnable n = () -> System.out.println("My Runnable Lambda");
        n.run();


        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + addition.operation(10, 5));
        System.out.println("10 - 5 = " + subtraction.operation(10, 5));
        System.out.println("10 x 5 = " + multiplication.operation(10, 5));
        System.out.println("10 / 5 = " + division.operation(10, 5));
    }
}
