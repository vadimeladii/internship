package com.mentoring.method;

public class MainClass {

//    A method is a block of code which only runs when it is called.

    public static void main(String[] args) {
        myMethod();
        System.out.println("---------------------------------");

        myMethodWithParameter("Vadim");
        System.out.println("---------------------------------");
    }

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethodWithParameter(String fname) {
        System.out.println(fname + " Refsnes");
    }
}
