package com.devtalles.exception.autocloseable;

public class CustomResourceExample {
    public static void main(String[] args) {
//        FakeDataBaseConnection connection = new FakeDataBaseConnection();

        try(FakeDataBaseConnection connection = new FakeDataBaseConnection()) {
            connection.fetchData();
//            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
