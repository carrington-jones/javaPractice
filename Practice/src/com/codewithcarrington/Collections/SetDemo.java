package com.codewithcarrington.Collections;

import java.util.*;

public class SetDemo {
    public static void show(){
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        //Do not rely on order when using HashSet. Only on uniqueness.

        //Removing duplicates
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a", "b", "c", "c");
        Set<String> set1 = new HashSet<>(collection);
        System.out.println(set);

        //Set Operations
        Set<String> set2 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set3 = new HashSet<>(Arrays.asList("b", "c", "d"));
        //Union- combo of 2 sets
        set2.addAll(set3);
        System.out.println(set2);
        //Intersection - items that are common in both sets
        set2.retainAll(set3);
        //Difference - What items are in 1st set but not 2nd.
        set2.removeAll(set3);

    }
}
