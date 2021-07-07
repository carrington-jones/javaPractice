package com.codewithcarrington.Generics;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> { //T represents template. It represents types of objects we want to store. Such as User, Int, or String. Classes can have parameters similar to methods.
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index) {
        return items [index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T>{
        private GenericList<T> list;
        private int index;


        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
