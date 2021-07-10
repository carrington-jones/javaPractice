package com.codewithcarrington.lambdas;

import java.util.function.Predicate;

public class Predicate1 {
    public static void show(){
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var result = isLongerThan5.test("sky");
        System.out.println(result);
    }

    public static void show1(){
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        //.and is equivalent to &&
        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
        hasLeftAndRightBraces.test("{key:vale}");

        //.or is equivalent to ||
        Predicate<String> hasLeftOrRightBraces = hasLeftBrace.or(hasRightBrace);
        hasLeftOrRightBraces.test("{key:vale}");
    }
}
