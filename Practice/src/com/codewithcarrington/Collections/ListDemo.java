package com.codewithcarrington.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        //add element at a certain index. Cannot be done with collections interface because collections do no support indexing.
        list.add(0,"!");

        //This will return [a,b]
        System.out.println(list.subList(0,2));
    }
}
