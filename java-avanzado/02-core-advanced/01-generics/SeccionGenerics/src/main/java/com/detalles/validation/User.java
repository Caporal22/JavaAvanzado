package com.detalles.validation;

public class User {

    private final String email;
    private final int age;

    public User(String email, int age) {
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
