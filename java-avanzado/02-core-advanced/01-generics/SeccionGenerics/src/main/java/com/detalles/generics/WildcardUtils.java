package com.detalles.generics;

import java.util.List;

public class WildcardUtils {

    // ? → wildcard desconocido (solo lectura)
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    // ? extends → productor (solo leer)
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.println(number.doubleValue());
        }
    }

    // ? super → consumidor (solo escribir de forma segura)
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}
