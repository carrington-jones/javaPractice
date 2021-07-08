package com.codewithcarrington.Collections;

import com.codewithcarrington.Generics.GenericList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {
    public static void main(String[] args) {
//        var list = new GenericList<String>();
//        list.add("a");
//        list.add("b");
//        for (String item : list) {
//            System.out.println(item);
//        }
//
//        CollectionsDemo.show();
//        CollectionsDemo.show1();

        //Comparable Interface (uses Customer.java)
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b"));
        customers.add(new Customer("a"));
        customers.add(new Customer("c"));
        Collections.sort(customers);
        System.out.println(customers);

    }
}
