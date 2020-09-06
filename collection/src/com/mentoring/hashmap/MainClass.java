package com.mentoring.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

/*
    Java HashMap class implements the map interface by using a hash table. It inherits AbstractMap class and implements Map interface.

        * Java HashMap class contains values based on the key.
        * Java HashMap class contains only unique keys.
        * Java HashMap class may have one null key and multiple null values.
        * Java HashMap class is non synchronized.
        * Java HashMap class maintains no order.
*/

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        System.out.println("Initial list of elements: " + hm);
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        System.out.println("After invoking put() method ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("---------------------------------");

        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("---------------------------------");

        HashMap<Integer, String> map = new HashMap<>();
        map.put(104, "Ravi");
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("---------------------------------");

        //key-based removal
        map.remove(100);
/*
        key-value pair based removal
        map.remove(100, "Amit");
*/
        System.out.println("List of elements: " + map);
        System.out.println("---------------------------------");

        map.replace(101, "Vijay", "Test");
        System.out.println("List of elements: " + map);
    }
}
