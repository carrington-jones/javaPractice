package com.codewithcarrington.lambdas;

public class LambdasDemo {

    public static void print(String message) {}

    public static void show(){
        greet(message -> System.out.println(message));


        //METHOD REFERENCE
        //Identical to Lambda Expression
        //Class/Object::method
        greet(LambdasDemo::print);
        //greet(System.out::println);


        //Printer printer = message -> System.out.println(message);

        // Anonymous Inner Classes.
//        greet(new Printer() {
//
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });

    }

    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
