package com.codewithcarrington.exceptions;

//Checked >>> Exception
//Unchecked (runtime) >>> RuntimeException

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(){
        super("Insufficent funds in your account.");
    }
    public InsufficientFundsException(String message){
        super(message);
    }
}
