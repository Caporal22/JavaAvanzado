package com.devtalles.estructuradedatos.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(30);


        System.out.println(numbers);

        numbers.remove(3);

        System.out.println("numbers = " + numbers);

        numbers.remove(1);
        numbers.add(90);

        System.out.println("numbers = " + numbers);

        System.out.println(numbers.contains(90));
        System.out.println(numbers.contains(1));

    }
}
