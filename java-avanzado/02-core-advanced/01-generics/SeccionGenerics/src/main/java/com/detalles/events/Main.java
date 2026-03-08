package com.detalles.events;

public class Main {

    public static void main(String[] args) {

        EventProcessor processor = new EventProcessor();

        UserCreatedEvent event =
                new UserCreatedEvent("daniel");

        UserCreatedEventHandler handler =
                new UserCreatedEventHandler();

        processor.process(event, handler);
    }
}
