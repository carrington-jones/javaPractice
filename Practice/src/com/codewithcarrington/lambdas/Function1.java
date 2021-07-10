package com.codewithcarrington.lambdas;

import java.util.function.Function;

public class Function1 {
    public static void show() {
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Sky");
        System.out.println(length);
    }

    public static void show1() {
        //"key:value"
        //first: "key:value"
        //second: "{key=value}"
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        //Declarative Programming
        var result = replaceColon.andThen(addBraces).apply("key:value");
        System.out.println(result);


    }
}
