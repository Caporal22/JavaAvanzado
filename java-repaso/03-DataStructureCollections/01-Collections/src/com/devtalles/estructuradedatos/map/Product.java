package com.devtalles.estructuradedatos.map;

import java.util.Map;
import java.util.TreeMap;

public class Product implements Comparable<Product>{
    private Integer id;
    private String name;

    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.id, o.id);
    }

    public static void main(String[] args) {
        Map<Product, Double> priceMap = new TreeMap<>();

        priceMap.put(new Product(10, "Laptop"), 1440.0);
        priceMap.put(new Product(20, "Mouse"), 320.0);
        priceMap.put(new Product(30, "Keyboard"), 500.0);

        System.out.println(priceMap);

        // Delete
        priceMap.remove(new Product(10,"Laptop"));

        System.out.println(priceMap);

        // Update
        priceMap.put(new Product(20, "Mouse"), 400.0);

        System.out.println(priceMap);

        System.out.println(priceMap.get(new Product(30, "Keyboard")));

    }
}
