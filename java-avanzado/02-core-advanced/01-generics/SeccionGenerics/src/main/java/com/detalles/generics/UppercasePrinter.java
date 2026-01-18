package com.detalles.generics;

public class UppercasePrinter<T extends CharSequence> {

    private final T value;

    public UppercasePrinter(T value) {
        this.value = value;
    }

    public void printUppercase() {
        System.out.println(value.toString().toUpperCase());
    }
}
