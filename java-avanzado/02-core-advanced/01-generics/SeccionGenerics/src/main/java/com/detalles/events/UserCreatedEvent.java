package com.detalles.events;

public class UserCreatedEvent extends Event {

    private final String username;

    public UserCreatedEvent(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
