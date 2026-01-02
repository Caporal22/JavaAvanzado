package com.devtalles.estructuradedatos.mapexamples;

import java.util.HashMap;
import java.util.Map;

public class ExampleInventoryHashMap {

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        // Create
        inventory.put("Laptop", 15);
        inventory.put("Mouse", 50);
        inventory.put("Keyboard", 30);

        // Read
        System.out.println("Initial inventory: " + inventory);
        System.out.println("Stock of Laptop: " + inventory.get("Laptop"));

        // Update
        inventory.put("Mouse", 45);
        System.out.println("Updated Mouse stock: " + inventory.get("Mouse"));

        // Delete
        inventory.remove("Keyboard");
        System.out.println("Inventory after removal: " + inventory);
    }
}
