package com.codewithcarrington.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show(){
        Collection<Integer> x;
        int[] number = {1, 2, 3};
        Arrays.stream(number).forEach(n -> System.out.println(n));
    }

    //This method prints out 3 random numbers.
    public static void show2(){
        var stream = Stream.generate(() -> Math.random());
        stream.limit(3).forEach(n -> System.out.println(n));
    }

    //Method that prints out 1-10
    public static void show3(){
        Stream.iterate(1, n-> n + 1).limit(10).forEach(n -> System.out.println(n));
    }

    public static void main(String[] args) {
        CreatingStreamsDemo.show();
        CreatingStreamsDemo.show2();
        CreatingStreamsDemo.show3();
    }
}
