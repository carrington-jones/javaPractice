package com.codewithcarrington;

import java.util.Locale;
import java.util.Scanner;

public class ControlFlow {
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        //---Logical Operators---//
//        int x =1;
//        int y =1;
//        System.out.println(x == y);
//
//        int temperature = 12;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);//Returns false
//
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);

        //---If Statements---//
//        int temp = 32;
//        if (temp > 30) {
//            System.out.println("It's a hot day!");
//            System.out.println("Drink water");
//        } else if (temp > 20 && temp <= 30) {
//            System.out.println("Beautiful day!");
//        } else {
//            System.out.println("Cold Day!");
//        }
//
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);


        //---Ternary Operator---//
//        int income = 120_000;
//        String className = income > 100_000 ? "First" : "Economy";
        //If income is great than 100,000 first class. Below 100,000 Economy

        //---Switch Statement---//
//        String role = "admin";
//        if (role == "admin"){
//            System.out.println("You are an admin");
//        } else if (role == "Moderator"){
//            System.out.println("You are a moderator");
//        } else {
//            System.out.println("You are a guest");
//        }
//
//        switch (role){
//            case "admin":
//                System.out.println("You are an admin");
//                break;
//            case "moderator":
//                System.out.println("You are a moderator");
//                break;
//            default:
//                System.out.println("You are a guest");
        //Do not need break since it the last code block.
//        }

        //---FizzBuzz Exercise---//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number!");
//        int userInput = scanner.nextInt();
//        if ((userInput % 3 == 0) && (userInput % 5 == 0)) {
//            System.out.println("Fizzbuzz!");
//        } else if (userInput % 5 == 0) {
//            System.out.println("Fizz!");
//        } else if (userInput % 3 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(userInput);
//        }
        //---For Loops---//
//        for (int i = 1; i <= 10; i++){
//            System.out.println("Hello World! " + i);
//        }
        //---While Loops---//
        Scanner scanner = new Scanner(System.in);
        String input = "";
//        while(!input.equals("quit")){
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }

        //---Do While--//
//        do {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while(!input.equals("quit"));

        //---Break and Continue--//
        //If you use while true make sure to have break statement
//        while(!input.equals("quit")){
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass")){
//                continue;
//            }
//            if(input.equals("quit")){
//                break;
//            }
//            System.out.println(input);
//        }

        //---For-Each Loops---//
        String[] fruits = {"Apple", "Mango", "Orange"};
        //For Loop
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
        //For Each loop or enhanced for loop
        for(String fruit : fruits)
            System.out.println(fruit);



    }
}

