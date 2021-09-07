package CodeupExtraExercises;

import java.util.*;

public class JavaPracticeProblems {
    public static void main(String[] args) {
        //PROBLEM 1
//        System.out.println(isPalindrome("racecar"));


        //PROBLEM 2
//        for (int n = 0; n < 10; ++n)
//            test(100000);

        //PROBLEM 3
//        int[] v = new int[] {5, 7, 1, 2, 8, 4, 3};
//        int[] test = new int[] {3, 20, 1, 2, 7};
//
//        for(int i = 0; i < test.length; i++){
//            boolean output = findSumOfTwo(v, test[i]);
//            System.out.println("findSumOfTwo(v, " + test[i] + ") = " + (output ? "true" : "false"));
//        }



    }

    //*****PROBLEM1*****

//    A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
//    Write a method that detects if a string is a palindrome.

//    SOLUTION:
//public static boolean isPalindrome(String word) {
//    int i1 = 0;
//    int i2 = word.length() - 1;
//    while (i2 > i1) {
//        if (word.charAt(i1) != word.charAt(i2)) {
//            return false;
//        }
//        ++i1;
//        --i2;
//    }
//    return true;


    //*****PROBLEM2*****
//    You are given an array of positive numbers from 1 to n, such that all numbers from 1 to n are present except one number ‘x’. You have to find ‘x’. The input array is not sorted.

//    static int find_missing(List<Integer> input) {
//         calculate sum of all elements
//         in input list
//        int sum_of_elements = 0;
//        for (Integer x : input) {
//            sum_of_elements += x;
//        }
//
//         There is exactly 1 number missing
//        int n = input.size() + 1;
//        int actual_sum = (n * ( n + 1 ) ) / 2;
//        return actual_sum - sum_of_elements;
//    }
//    static void test(int n) {
//        int missing_element = (new Random()).nextInt(n) + 1;
//        List<Integer> v = new ArrayList<Integer>();
//        for(int i = 1; i <= n; ++i) {
//            if (i != missing_element)
//                v.add(i);
//        }
//
//        int actual_missing = find_missing(v);
//        System.out.print("Expected Missing = ");
//        System.out.print(missing_element);
//        System.out.print(" Actual Missing = ");
//        System.out.println(actual_missing);
//        System.out.println("Missing Element == Actual Missing : "+ (missing_element == actual_missing));
//    }

    //*****PROBLEM3*****
//    Given an array of integers and a value, determine if there are any two integers in the array whose sum is equal to the given value.
//    Return true if the sum exists and return false if it does not.

//    static boolean findSumOfTwo(int[] A, int val) {
//        Set<Integer> foundValues = new HashSet<Integer>();
//        for (int a : A) {
//            if (foundValues.contains(val - a)) {
//                return true;
//            }
//
//            foundValues.add(a);
//        }
//        return false;
//    }


}


