package com.codewithcarrington.Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show3(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        //b -> a -> c
        queue.offer("d");
        //d-> b -> a -> c

        //Return item at front
//        var front = queue.peek(); //returns null if queue is empty
//        System.out.println(front);

        //Return item at front
//        var front1 = queue.element(); //throws error if queue is empty
//        System.out.println(front);
    }
}
