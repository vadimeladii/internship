package com.mentoring.method;

class MainClass {

    public static void main(String[] args) {
//        Create an Object
        Employee employee = new Employee();

        System.out.println(employee.print());
        System.out.println("---------------------------------");

        System.out.println(Employee.myStaticMethod());
        System.out.println("---------------------------------");
    }
}
