package com.detalles.events;

public class UserCreatedEventHandler
        implements EventHandler<UserCreatedEvent> {

    @Override
    public void handle(UserCreatedEvent event) {
        System.out.println(
                "User created: " + event.getUsername() +
                        " at " + event.getOccurredAt()
        );
    }
}
