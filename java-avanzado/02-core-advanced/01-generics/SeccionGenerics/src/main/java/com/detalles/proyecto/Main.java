package com.detalles.proyecto;

import com.detalles.generics.MathUtils;
import com.detalles.generics.Utility;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Daniel");

        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>(22);
        System.out.println(integerBox.getValue());

        Utility.printItem("Daniel", 2);
        Utility.printItem(10);

        MathUtils.sum(2,2);


    }
}
