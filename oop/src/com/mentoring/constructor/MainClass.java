package com.mentoring.constructor;

class MainClass {

/*
    A constructor in Java is a special method that is used to initialize objects.
    The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.
*/

    public static void main(String[] args) {
//        Create Object
        Book book = new Book("title_test", "author_test", 2000, 145.5);
        System.out.println(book.toString());
    }
}
