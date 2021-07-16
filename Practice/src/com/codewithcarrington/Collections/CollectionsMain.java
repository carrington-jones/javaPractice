package com.codewithcarrington.Collections;

import java.util.*;

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
//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer("b", "e3"));
//        customers.add(new Customer("a", "e2"));
//        customers.add(new Customer("c", "e1"));
//        Collections.sort(customers);
//        System.out.println(customers);

        //EmailComparator.java class (Comparator Interface) This sort array list by emails.
//        Collections.sort(customers, new EmailComparator());
//        System.out.println(customers);

        //Queue Operator. Uses QueueDemo.java class
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        System.out.println(queue);

        Queue<String> queue2 = new ArrayDeque<>();
        queue2.add("d");
        queue2.add("e");
        queue2.add("f");
        System.out.println(queue2);
    }
}
