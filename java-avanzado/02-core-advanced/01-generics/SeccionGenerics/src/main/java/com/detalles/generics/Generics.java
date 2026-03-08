package com.detalles.generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add("Daniel");
        list.add(10);

        for (Object o : list) {
            String text = (String) o;
            System.out.println(text.toUpperCase());
        }

    }
}
