package com.codewithcarrington.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() throws IOException{
        var account = new Account ();
        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage()); //Get message from "super" in InsufficientFundsException class
        }
    }

    public static void show2() throws IOException{
        var account = new Account ();
        try {
            account.withdraw2(10);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }



    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
