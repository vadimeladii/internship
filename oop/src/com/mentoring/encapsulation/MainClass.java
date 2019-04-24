package com.mentoring.encapsulation;

public class MainClass {
    public static void main(String[] args) {
//        Create an Object
        Home home = new Home("test_name", "address_name", 81.4);
        home.setName("test_name_2"); // change field name

        System.out.println(home.toString());
    }
}
