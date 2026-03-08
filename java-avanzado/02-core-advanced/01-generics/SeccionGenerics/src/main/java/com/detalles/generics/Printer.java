package com.detalles.generics;

public class Printer<T> {

    private final T value;

    public Printer(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }

    public T getValue() {
        return value;
    }
}
