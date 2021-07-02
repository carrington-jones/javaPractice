package com.codewithcarrington.exceptions;

import java.io.IOException;

public class ExceptionsMain {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (IOException e) {
            System.out.println("Unexpected error");
        }
    }
}
