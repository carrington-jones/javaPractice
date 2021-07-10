package com.codewithcarrington.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperator1 {
    public static void show(){

        //a, b -> a + b -> square
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> square = a -> a * a;

        var result = add.andThen(square).apply(1, 2);
        System.out.println(result);

    }
}
