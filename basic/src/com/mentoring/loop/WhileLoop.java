package com.mentoring.loop;

class WhileLoop {

    public static void main(String[] args) {

/*
        while (condition) {
            // code block to be executed
        }
*/
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("---------------------------------");

/*
        do {
            // code block to be executed
        }
        while (condition);
*/

        i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }
}
