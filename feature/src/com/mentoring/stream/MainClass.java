package com.mentoring.stream;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

/*
    Introduced in Java 8, the Stream API is used to process collections of objects.
    A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.

    Intermediate Operations:

        * map: The map method is used to map the items in the collection to other objects according to the Predicate passed as argument.
        * filter: The filter method is used to select elements as per the Predicate passed as argument.
        * sorted: The sorted method is used to sort the stream.

    Terminal Operations:

        * collect: The collect method is used to return the result of the intermediate operations performed on the stream.
        * forEach: The forEach method is used to iterate through every element of the stream.
        * reduce: The reduce method is used to reduce the elements of a stream to a single value.
*/

    public static void main(String[] args) {
        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        List<List<Integer>> lists = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));

        Optional<Integer> first = lists.stream().flatMap(n -> n.stream()).findFirst();
        first.orElse(0);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        System.out.println(square);

        // create a list of String
        List<String> names =
                Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        numbers.stream().count();

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

        // demonstration of reduce method
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

        System.out.println(even);
    }
}