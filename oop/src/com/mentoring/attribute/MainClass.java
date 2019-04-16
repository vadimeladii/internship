package com.mentoring.attribute;

class MainClass {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p2.fname = "first_name";
        p2.lname = "last_name";
        p2.age = 20;

        print(p1);
        print(p2);
    }

    static void print(Person person) {
        System.out.println("Name: " + person.fname + " " + person.lname);
        System.out.println("Age: " + person.age);
        System.out.println("---------------------------------");
    }
}
