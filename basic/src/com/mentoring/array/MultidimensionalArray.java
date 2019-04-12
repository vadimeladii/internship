package com.mentoring.array;

public class MultidimensionalArray {

//    To create a two-dimensional array, add each array within its own set of curly braces:

    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

//        access the elements of an array
        System.out.println(myNumbers[1][2]); // outputs 7
        System.out.println("----------------------");

//        loop through an array
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        System.out.println("----------------------");
    }
}
