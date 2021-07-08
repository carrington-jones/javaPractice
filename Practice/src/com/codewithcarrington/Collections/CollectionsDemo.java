package com.codewithcarrington.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        //Remove element
        //collection.remove("a");

        //See if array list contains element. This method returns a boolean.
        //var containsB = collection.contains("b")
        //System.out.println(containsB);


        for (var item : collection)
            System.out.println(collection);
    }

    //
    //Another way to add elements
    public static void show1() {
        Collection<String> animals = new ArrayList<>();
        Collections.addAll(animals, "dog", "cat", "bird");

        for (var item : animals)
            System.out.println(animals);
    }

}
