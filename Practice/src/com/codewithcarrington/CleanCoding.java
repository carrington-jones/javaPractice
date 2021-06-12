package com.codewithcarrington;

public class CleanCoding {
    public static void main(String[] args) {
       String message = greetUser("Carrington", "Jones");
    }

    public static String greetUser(String firstName, String lastName ){
        return "Hello " + firstName + " " + lastName;
    }

}
