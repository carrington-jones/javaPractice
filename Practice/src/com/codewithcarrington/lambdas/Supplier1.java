package com.codewithcarrington.lambdas;

import java.util.function.Supplier;

public class Supplier1 {
    public static void show() {
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);

    }
}
