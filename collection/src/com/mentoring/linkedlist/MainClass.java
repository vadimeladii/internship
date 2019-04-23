package com.mentoring.linkedlist;

import com.mentoring.entity.Book;

import java.util.LinkedList;
import java.util.List;

public class MainClass {

    /*
    Java LinkedList class uses a doubly linked list to store the elements.
    It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

    The important points about Java LinkedList are:

        * Java LinkedList class can contain duplicate elements.
        * Java LinkedList class maintains insertion order.
        * Java LinkedList class is non synchronized.
        * Java LinkedList class can be used as a list, stack or queue.
*/

    public static void main(String[] args) {
        List<Book> books = new LinkedList<>(); //Creating linkedlist

        Book book1 = new Book(101L, "Let us C#", "Yashwant Kanetkar", "BPB", 8);
        Book book2 = new Book(102L, "Data Networking", "Forouzan", "Mc Graw Hill", 4);
        Book book3 = new Book(103L, "System", "Galvin", "Wiley", 9);

//        Adding books to linkedlist
        books.add(book1);
        books.add(book2);
        books.add(book3);

//        Traversing list
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("---------------------------------");

        System.out.println("Is LinkedList Empty: " + books.isEmpty());
        System.out.println("---------------------------------");

//        Removing element on the basis of specific position
        books.remove(1);
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("---------------------------------");

//        Retrieve an element at specific position
        Book book0 = books.get(1);
        System.out.println("Get element: " + book0);
        System.out.println("---------------------------------");

        book0.setQuantity(20);
//        Updating an element at specific position
        books.set(1, book0);
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
