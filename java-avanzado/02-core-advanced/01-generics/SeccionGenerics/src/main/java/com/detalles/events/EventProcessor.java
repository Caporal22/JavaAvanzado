package com.detalles.events;

public class EventProcessor {

    public <T extends Event> void process(
            T event,
            EventHandler<T> handler
    ) {
        handler.handle(event);
    }
}
