package com.mentoring.hashset;

import java.util.HashSet;

public class MainClass {

/*
    Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

    The important points about Java HashSet class are:

        * HashSet stores the elements by using a mechanism called hashing.
        * HashSet contains unique elements only.
        * HashSet allows null value.
        * HashSet class is non synchronized.
        * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
        * HashSet is the best approach for search operations.
*/

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: " + set);
        System.out.println("---------------------------------");

//        Removing specific element from HashSet
        set.remove("Ravi");
        System.out.println("After invoking remove(object) method: " + set);
        System.out.println("---------------------------------");

        HashSet<String> set1 = new HashSet<>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: " + set);
        System.out.println("---------------------------------");

//        Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: " + set);
        System.out.println("---------------------------------");

//        Removing elements on the basis of specified condition
        set.removeIf(str -> str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: " + set);
        System.out.println("---------------------------------");

//        Traversing list
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("---------------------------------");


//        Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: " + set);
        System.out.println("---------------------------------");
    }
}
