package com.devtalles.proyect.examples;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Demonstrates how to generate JSON files using Gson and Jackson.
 * Both examples are production-level: formatted output, error handling,
 * and safe file creation with directory check.
 */
public class JsonGenerationExample {

    public static void main(String[] args) {

        Employee employee = new Employee("E001", "Daniel", "Backend Developer", 24500.50);
        Product product = new Product("P-XL12", "Ultra Keyboard", 4.7, 1099.99);

        createDir("output/json");

        generateWithGson(employee, "output/json/employee-gson.json");
        generateWithJackson(product, "output/json/product-jackson.json");

        System.out.println("JSON files generated successfully.");
    }


    /* --------------------- GSON EXAMPLE --------------------- */
    private static void generateWithGson(Employee data, String filePath) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(data, writer);
        } catch (IOException ex) {
            throw new RuntimeException("Error generating JSON with Gson", ex);
        }
    }


    /* -------------------- JACKSON EXAMPLE ------------------- */
    private static void generateWithJackson(Product data, String filePath) {
        ObjectMapper mapper = new ObjectMapper()
                .enable(SerializationFeature.INDENT_OUTPUT);

        try {
            mapper.writeValue(new File(filePath), data);
        } catch (IOException ex) {
            throw new RuntimeException("Error generating JSON with Jackson", ex);
        }
    }


    /* Utility: create directory if it does not exist */
    private static void createDir(String directory) {
        try {
            Path path = Path.of(directory);
            if (!Files.exists(path)) {
                Files.createDirectories(path);
            }
        } catch (IOException ex) {
            throw new RuntimeException("Could not create directory: " + directory, ex);
        }
    }
}


/* ===================== DATA MODELS ===================== */

/**
 * POJO compatible with both Gson and Jackson.
 * Contains a no-arg constructor and public getters.
 */
class Employee {
    private String id;
    private String name;
    private String role;
    private double salary;

    // No-arg constructor required by Jackson
    public Employee() { }

    public Employee(String id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    // Getters (Jackson uses these by default)
    public String getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public double getSalary() { return salary; }

    // Optional: setters if you need deserialization into an existing object
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setSalary(double salary) { this.salary = salary; }
}

/**
 * POJO compatible with both Gson and Jackson.
 */
class Product {
    private String code;
    private String description;
    private double rating;
    private double price;

    // No-arg constructor required by Jackson
    public Product() { }

    public Product(String code, String description, double rating, double price) {
        this.code = code;
        this.description = description;
        this.rating = rating;
        this.price = price;
    }

    public String getCode() { return code; }
    public String getDescription() { return description; }
    public double getRating() { return rating; }
    public double getPrice() { return price; }

    public void setCode(String code) { this.code = code; }
    public void setDescription(String description) { this.description = description; }
    public void setRating(double rating) { this.rating = rating; }
    public void setPrice(double price) { this.price = price; }
}
