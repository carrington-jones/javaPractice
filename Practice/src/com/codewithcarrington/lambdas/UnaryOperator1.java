package com.codewithcarrington.lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperator1 {
    public static void show(){
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        var result = increment.andThen(square).apply(1);
        System.out.println(result);
        //Increment add 1 AND THEN squares it for a result of 4
    }
}
