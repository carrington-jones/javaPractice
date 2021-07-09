package com.codewithcarrington.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Java: Maps

public class MapDemo {
    public static void show4 (){
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        var c3 = new Customer("c", "e3");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        map.put(c3.getEmail(), c3);

        var customer= map.get("e1");
        System.out.println(customer);


        //map.getOrDefault. Look for key e10. If not found return unknown customer.
        var unknown = new Customer("Unknown", "");
        var customer1= map.getOrDefault("e10", unknown);
        System.out.println(customer);

        //Returns a boolean
        var exists= map.containsKey("e10");
        System.out.println(exists);

        //Replace Customer
        var customer4 = map.replace("e1", new Customer("a++", "e1"));
        System.out.println(map);

        //Map is not an iterable object. So have to you methods below.
        for (var key : map.keySet())
            System.out.println(key);

        //Returns key=value
        for (var entry : map.entrySet())
            System.out.println(entry);

        //Returns key
        for (var entry : map.entrySet())
            System.out.println(entry.getKey());

        //Returns value
        for (var entry : map.entrySet())
            System.out.println(entry.getValue());

        //Iterates over customer objects
        for (var customer5 : map.values())
            System.out.println(customer);


    }
}
