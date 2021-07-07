package com.codewithcarrington.Collections;

import com.codewithcarrington.Generics.GenericList;

public class CollectionsMain {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for (String item : list) {
            System.out.println(item);
        }

    }
}
