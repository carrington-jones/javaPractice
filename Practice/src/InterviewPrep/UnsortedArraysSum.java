package InterviewPrep;

//Given two unsorted arrays of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X

import java.util.HashMap;

public class UnsortedArraysSum {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 5, 4 };
        int[] arr2 = {0, 7, 4, 3, 2, 1};
        int x = 8;
        findPairs(arr1, arr2, arr1.length, arr2.length, x);

        int[] arr3 = { 1, 0, -4, 7, 6, 4 };
        int[] arr4 = { 0, 2, 4, -3, 2, 1 };
        int z = 8;

        findPairs2(arr3, arr4, arr3.length, arr4.length, z);

    }

    public static void findPairs(int[] arr1, int[] arr2, int n, int m, int x){
        for (int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                if(arr1[i] + arr2[j] == x)
                    System.out.println(arr1[i] + " " + arr2[j]);
    }

    public static void findPairs2(int[] arr3, int[] arr4, int n, int m, int z){

        //Insert all element of first array in a hash
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++)
            s.put(arr3[i], 0);

        // Subtract sum from second array elements one by one and check it's present in array first or not.

        for(int j = 0; j < m; j++)
            if(s.containsKey(z-arr4[j]))
                System.out.println(z - arr3[j] + " " + arr4[j]);

    }
}
