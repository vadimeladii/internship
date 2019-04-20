package com.mentoring.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
/*
    Java ArrayList class uses a dynamic array for storing the elements.
    The important points about Java ArrayList class are:

        * Java ArrayList class can contain duplicate elements.
        * Java ArrayList class maintains insertion order.
        * Java ArrayList class is non synchronized.
*/

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(); //Creating arraylist

        Book book1 = new Book(101L, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book book2 = new Book(102L, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book book3 = new Book(103L, "Operating System", "Galvin", "Wiley", 6);

//        Adding books to list
        books.add(book1);
        books.add(book2);
        books.add(book3);

//        Traversing list
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("---------------------------------");

        System.out.println("Is ArrayList Empty: " + books.isEmpty()); //
        System.out.println("---------------------------------");

//        Removing element on the basis of specific position
        books.remove(0);
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("---------------------------------");

//        Retrieve an element at specific position
        Book book0 = books.get(0);
        System.out.println("Get element: " + book0);
        System.out.println("---------------------------------");

        book0.setQuantity(10);
//        Updating an element at specific position
        books.set(0, book0);
        System.out.println("Get element: " + book0);
        System.out.println("---------------------------------");

//        Return the number of elements present in the list
        System.out.println("Number of elements: " + books.size());
        System.out.println("---------------------------------");

//        Removing all the elements available in the list
        books.clear();
        System.out.println("Number of elements: " + books.size());
        System.out.println("---------------------------------");
    }
}
