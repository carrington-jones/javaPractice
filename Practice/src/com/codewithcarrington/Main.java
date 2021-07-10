package com.codewithcarrington;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    //anything in orange are reserved keywords in Java.
    public static void main(String[] args) {

        //-----Primitive Types-----//
//        byte hisAge = 30;
//        byte herAge = hisAge;
//        long viewsCount = 3123456789L; //must have L for longs
//
//        double price = 10.99F;//must have F for floats
//
//        char letter = 'A';
//
//        boolean isEligible = false;
        //-----Reference Types-----//
//        byte age = 30;
//        Date now = new Date();
//        System.out.println(now);
//
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y); //Prints out 1 because x and y are independent.

//        Point point1 = new Point(1, 1);
//        Point point2 = point1; //Point2 does not have the same VALUE as point1 this is actually referring to the address location in the memory.
//        point1.x = 2; //point2 is referring to new Point on line 30. So when we print point2 is prints the change made to point1.
//        System.out.println(point2);

        //-----Strings-----//
        String message = "  Hello World" + "!!  ";
//
//        System.out.println(message.startsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("o"));//Will only return the first occurrence of character. If character does not exist it will return -1
//        System.out.println(message.replace("!","*"));//Does not modify original string. Prints new string.
        System.out.println(message);
//        System.out.println(message.toLowerCase());
//        System.out.println(message);
//        System.out.println(message.toUpperCase());
//        System.out.println(message);
//        System.out.println(message.trim());//Removes white space

        //-----Escape Sequences-----//
//        String message2 = "Hello Carrington";
//        System.out.println(message2);
//        message2 = "Hello \"Carrington\"";
//        System.out.println(message2);
//        message2 = "Hello \t \"Carrington\""; // \t inserts a tab when run.
//        System.out.println(message2);

        //-----Arrays-----//
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        System.out.println(Arrays.toString(numbers));
//
//        int[] numbers2 = {2, 3, 5, 1, 4};
//        System.out.println(numbers2.length); //returns how many elements are in the array
//        Arrays.sort(numbers2);
//        System.out.println(Arrays.toString(numbers2));

        //-----MultiDimensionalArrays-----//

//        int[][] numbers = new int[2][3];//First numbers sets rows and second sets columns
//        numbers [0][0] = 1; //This changes 1st element in 1st row and 1st column
//        numbers [1][2] = 5; //This changes 2nd row 3rd column
//        System.out.println(Arrays.deepToString(numbers)); //In order to access the 2d array must use "deepToString" method

//        int[][] numbers1 = {  {1, 2, 3}, {4, 5, 6}  }; //Another way to declare 2d array
//        System.out.println(Arrays.deepToString(numbers1));

        //-----Constants-----//

//        final float PI = 3.14F; //Constants are written in all caps as seen to the left.
//        PI = 1; //Will not work because of "final" in line above.

        //-----Arithmetic Expressions-----//
//        int result = 10 / 3; //This returns a whole number because of int. Would need to cast double to return the decimal.
//        double result1 = (double) 10 / (double) 3;
//        System.out.println(result1);

        //-----Casting-----//
//        short x = 1;
//        int y = x +2;
//        System.out.println(y);//This comes out to 3. This is called Implicit casting. short is converted to int. byte > short > int > long > float > double

//        String a = "1";
//        int b = Integer.parseInt(a) + 2;
//        System.out.println(b);//This comes out to 3 due to the "Integer.parseInt"

        //-----The Math Class-----//

//        int result = Math.round(1.1F); //Rounds to 1
//        int result1 = Math.max(1, 2); //Returns 2 because it is higher
//        int result2 = (int) Math.round(Math.random() * 100); //Returns a random number between 1 and 100
//        System.out.println(result2);

        //-----Formatting Numbers-----//

//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);//Returns "$1,234,567.89"
//        System.out.println(result);


//        String result1 = NumberFormat.getPercentInstance().format(0.1); // This is called method chaining. This returns "10%"
//        System.out.println(result1);

        //-----Reading Input-----//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);

        //-----Method Overriding-----// Overwrote to String method in TextBox1 class
//        var textBox = new TextBox1();
//        textBox.setText("Hello World!");
//        System.out.println(textBox);

        //-----Upcasting and Downcasting-----//
//        var control = new UIControl(true);
//        var textBox = new TextBox1();
//        show(control);

        //-----Comparing Objects-----//
//        var point1 = new Point(1, 2);
//        var point2 = new Point(1, 2);
//        System.out.println(point1.equals(point2));
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());

        //-----Polymorphism-----//
//        UIControl[] controls = {new TextBox1(), new CheckBox()}; //We generated render methods in TextBox1 and ChcekBox classes.
//        for (var control : controls) {
//            control.render();
//        }
//        var calculator = new TaxCalculator2021(1000);
//        var report = new TaxReport();
//        report.show(calculator);

//        report.setCalculator(new TaxCalculator2022());
//        report.show(new TaxCalculator2022());


    }



    //-----Upcasting and Downcasting-----//
//    public static void show(UIControl control){
//        var textBox = (TextBox1) control;
//        textBox.setText("Hello World!");
//        System.out.println(control);

}
