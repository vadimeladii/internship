package com.mentoring.method;

class Employee {

    String name = "John";
    int age = 38;
    double salary = 1000;

//    Public method
    String print() {
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
