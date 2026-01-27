package com.detalles.proyecto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Daniel");

        System.out.println(stringBox.getValue());

        com.detalles.proyecto.Box<Integer> integerBox = new com.detalles.proyecto.Box<>(22);
        System.out.println(integerBox.getValue());
    }
}
