package com.devtalles.estructuradedatos.mapexamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {

    private String id;
    private String email;

    public User(String id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{id='" + id + "', email='" + email + "'}";
    }

    public static void main(String[] args) {

        Map<String, User> users = new HashMap<>();

        // Create
        users.put("U1", new User("U1", "ana@email.com"));
        users.put("U2", new User("U2", "carlos@email.com"));

        // Read
        System.out.println("Users: " + users);

        // Update
        users.put("U2", new User("U2", "carlos.updated@email.com"));

        // Delete
        users.remove("U1");

        System.out.println("Users after changes: " + users);
    }
}
