package com.mentoring.into;

class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello World");

        for (String arg : args) {
            System.out.println(arg);
        }

//        java 8
//        Arrays.stream(args).forEach(System.out::println);
    }
}
