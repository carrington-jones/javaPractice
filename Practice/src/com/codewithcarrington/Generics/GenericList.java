package com.codewithcarrington.Generics;

public class GenericList<T extends Number> { //T represents template. It represents types of objects we want to store. Such as User, Int, or String. Classes can have parameters similar to methods.
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index) {
        return items [index];
    }
}
