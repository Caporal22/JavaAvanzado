package com.detalles.proyecto;

import com.detalles.generics.MathUtils;
import com.detalles.generics.Utility;
import com.detalles.generics.WildcardUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Daniel");

        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>(22);
        System.out.println(integerBox.getValue());

        Utility.printItem("Daniel", 2);
        Utility.printItem(10);

        MathUtils.sum(2,2);


        // ? wildcard
        List<String> names = List.of("Daniel", "Java", "Generics");
        WildcardUtils.printList(names);

        // ? extends (producer)
        List<Integer> integers = List.of(10, 20, 30);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);

        WildcardUtils.printNumbers(integers);
        WildcardUtils.printNumbers(doubles);

        // ? super (consumer)
        List<Number> numbers = new ArrayList<>();
        WildcardUtils.addIntegers(numbers);

        System.out.println("After adding integers:");
        WildcardUtils.printList(numbers);

    }
}
