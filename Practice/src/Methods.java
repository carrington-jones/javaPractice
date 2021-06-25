import java.util.Scanner;

public class Methods {

    public static int countAs(String userString) {
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            char ch = userString.charAt(i);
            if (ch == 'a') {
                count++;
            }
        }
        return count;

    }

    public static int countEs(String userString) {
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            char ch = userString.charAt(i);
            if (ch == 'e') {
                count++;
            }
        }
        return count;
    }

    public static int countIs(String userString) {
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            char ch = userString.charAt(i);
            if (ch == 'i') {
                count++;
            }
        }
        return count;
    }

    public static int countOs(String userString) {
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            char ch = userString.charAt(i);
            if (ch == 'o') {
                count++;
            }
        }
        return count;
    }

    public static int countUs(String userString) {
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            char ch = userString.charAt(i);
            if (ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void countVowels(String userString) {

        int numberOfAs = countAs(userString);
        int numberOfEs = countEs(userString);
        int numberOfIs = countIs(userString);
        int numberOfOs = countOs(userString);
        int numberOfUs = countUs(userString);
        System.out.println(numberOfAs + "A(s) in your String\n" + numberOfEs + "E(s) in your String\n" + numberOfIs + "I(s) in your String\n" + numberOfOs + "O(s) in your String\n" + numberOfUs + "U(s) in your String");
    }


    //    Create a method that will return how many capital letters are in a string.
    public static void countUpperAndLower(String userString) {
        int upperCase = 0;
        int lowerCase = 0;
        for (int k = 0; k < userString.length(); k++) {
            // Check for uppercase letters.
            if (Character.isUpperCase(userString.charAt(k))) upperCase++;

            // Check for lowercase letters.
            if (Character.isLowerCase(userString.charAt(k))) lowerCase++;
        }
        System.out.printf("There are %d uppercase letters and %d lowercase letters.", upperCase, lowerCase);
    }

    public static void main(String[] args) {
        countVowels("Watermelon");
        countUpperAndLower("wAtErmEllOn");
    }
}

