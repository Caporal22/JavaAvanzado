package com.detalles.generics;

public class Utility {
    public static <T> void printItem(T item) {
        System.out.println(item);
    }

    public static <T, K> void printItem(T item, K key) {
        System.out.println(item + " " + key);
    }
}
