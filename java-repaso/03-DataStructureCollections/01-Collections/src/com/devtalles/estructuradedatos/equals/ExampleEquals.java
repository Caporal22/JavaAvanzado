package com.devtalles.estructuradedatos.equals;

public class ExampleEquals {

    public static void main(String[] args) {

        Integer numberA = 100;
        Integer numberB = 100;

        System.out.println("Usando == : " + (numberA == numberB));
        System.out.println("Usando equals(): " + numberA.equals(numberB));
    }
}
