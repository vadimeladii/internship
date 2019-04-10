package com.mentoring.condition;

public class IfElseStatement {

/*
    Use IF to specify a block of code to be executed, if a specified condition is true
    Use ELSE to specify a block of code to be executed, if the same condition is false
    Use ELSE IF to specify a new condition to test, if the first condition is false
    Use SWITCH to specify many alternative blocks of code to be executed
*/

    public static void main(String[] args) {

/*
        if (condition) {
            // block of code to be executed if the condition is true
        }
*/
        int time = 22;
        if (time > 18) {
            System.out.println("22 is greater than 18");
        }

/*
        if (condition) {
            // block of code to be executed if the condition is true
        } else {
            // block of code to be executed if the condition is false
        }

        OR

        variable = (condition) ? expressionTrue : expressionFalse;
*/

        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

//      OR

        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

/*
        if (condition1) {
            // block of code to be executed if condition1 is true
        } else if (condition2) {
            // block of code to be executed if the condition1 is false and condition2 is true
        } else {
            // block of code to be executed if the condition1 is false and condition2 is false
        }
*/

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
