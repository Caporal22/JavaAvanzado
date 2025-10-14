package com.detalles.proyecto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Daniel");

        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>(22);
        System.out.println(integerBox.getValue());
    }
}
