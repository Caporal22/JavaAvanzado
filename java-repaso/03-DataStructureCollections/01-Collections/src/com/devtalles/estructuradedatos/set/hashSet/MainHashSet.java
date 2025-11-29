package com.devtalles.estructuradedatos.set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        numbers.remove(30);

        System.out.println("numbers = " + numbers);
    }
}
