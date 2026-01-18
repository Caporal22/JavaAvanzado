package com.detalles.generics;

public class Main {

    public static void main(String[] args) {

        Printer<Integer> intPrinter = new Printer<>(10);
        Printer<String> stringPrinter = new Printer<>("Daniel");

        intPrinter.print();
        stringPrinter.print();

        UppercasePrinter<String> upperPrinter =
                new UppercasePrinter<>("java generics are powerful");

        upperPrinter.printUppercase();
    }
}
