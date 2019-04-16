package com.mentoring.method;

public class Employee {

    String name = "John";
    int age = 38;
    double salary = 1000;

//    Public method
    public String print() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

//    Static method
    static String myStaticMethod() {
        return "Static methods can be called without creating objects";
    }
}
