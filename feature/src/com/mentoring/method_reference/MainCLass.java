package com.mentoring.method_reference;

import java.util.ArrayList;
import java.util.List;

public class MainCLass {

/*
    Method references help to point to methods by their names. A method reference is described using "::" symbol.
    A method reference can be used to point the following types of methods:

        * Static methods
        * Instance methods
        * Constructors using new operator (TreeSet::new)

        Class::staticMethod
        Object :: methodName
        ClassName::new
*/

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }
}
