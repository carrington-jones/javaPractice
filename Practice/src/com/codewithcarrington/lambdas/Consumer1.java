package com.codewithcarrington.lambdas;

import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    public static void show(){
        //List<Integer> list = List.of(1, 2, 3);

        //Imperative Programming for, if/else, switch/case)
        //for (var item : list) {
        //    System.out.println(item);
        //}

        //Declarative Programming
        //list.forEach((item) -> {
        // System.out.println(item);
        //});

        //CHAINING CONSUMER INTERFACES
        List<String> list = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printUpperCase).andThen(print));


    }
}
