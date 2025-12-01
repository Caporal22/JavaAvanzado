package com.devtalles.estructuradedatos.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<String, Integer>();
        productPrices.put("Laptop", 1000);
        productPrices.put("Smartphone", 500);
        productPrices.put("Tablet", 800);

        System.out.println(productPrices);

        System.out.println(productPrices.get("Laptop"));

        productPrices.put("Smartphtone", 650);
        System.out.println(productPrices.get("Smartphtone"));

        productPrices.remove("Tablet");
        System.out.println(productPrices);

    }
}
