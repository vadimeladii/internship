package com.mentoring.into;

class MainClass {

/*
    Java is a popular programming language, created in 1995.

    It is owned by Oracle, and more than 3 billion devices run Java.

    It is used for:

        * Mobile applications (specially Android apps)
        * Desktop applications
        * Web applications
        * Web servers and application servers
        * Games
        * Database connection
        * ...

    Why Use Java?

        * Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
        * It is one of the most popular programming language in the world
        * It is easy to learn and simple to use
        * It is open-source and free
        * It is secure, fast and powerful
        * It has a huge community support (tens of millions of developers)
*/

    public static void main(String[] args) {
        System.out.println("Hello World");

        for (String arg : args) {
            System.out.println(arg);
        }

//        java 8
//        Arrays.stream(args).forEach(System.out::println);
    }
}
