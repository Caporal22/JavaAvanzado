package com.devtalles.estructuradedatos.mapexamples;

import java.util.Map;
import java.util.TreeMap;

public class Order implements Comparable<Order> {

    private Integer orderId;
    private String customer;

    public Order(Integer orderId, String customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    @Override
    public int compareTo(Order o) {
        return this.orderId.compareTo(o.orderId);
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId + ", customer='" + customer + "'}";
    }

    public static void main(String[] args) {

        Map<Order, Double> orders = new TreeMap<>();

        // Create
        orders.put(new Order(1001, "Daniel"), 250.0);
        orders.put(new Order(1003, "Maria"), 120.0);
        orders.put(new Order(1002, "Ana"), 300.0);

        System.out.println("Orders: " + orders);

        // Update
        orders.put(new Order(1002, "Ana"), 350.0);

        // Read
        System.out.println("Order 1003 total: " +
                orders.get(new Order(1003, "Maria")));

        // Delete
        orders.remove(new Order(1001, "Daniel"));

        System.out.println("Orders after changes: " + orders);
    }
}
