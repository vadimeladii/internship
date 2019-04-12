package com.mentoring.exception;

public class MainClass {

/*
    The try statement allows you to define a block of code to be tested for errors while it is being executed.
    The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
    The finally statement lets you execute code, after try...catch, regardless of the result:
*/

    public static void main(String[] args) {

/*
        try {
            //  Block of code to try
        }
        catch(Exception e) {
            //  Block of code to handle errors
        }
*/

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        System.out.println("---------------------------------");

//        With finally statement

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

    }
}
