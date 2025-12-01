package com.devtalles.estructuradedatos.map;

import java.util.*;

public class ExampleTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new TreeMap<String, Integer>();
        productPrices.put("Laptop", 1000);
        productPrices.put("Smartphone", 500);
        productPrices.put("Tablet", 800);
        productPrices.put("Mouse", 200);
        productPrices.put("Disk", 750);

        System.out.println(productPrices);

        System.out.println(productPrices.get("Laptop"));

        productPrices.put("Smartphtone", 650);
        System.out.println(productPrices.get("Smartphtone"));

        productPrices.remove("Tablet");
        System.out.println(productPrices);
    }
}
