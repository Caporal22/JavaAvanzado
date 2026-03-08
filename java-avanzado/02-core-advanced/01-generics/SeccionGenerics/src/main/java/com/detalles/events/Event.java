package com.detalles.events;

import java.time.LocalDateTime;

public abstract class Event {

    private final LocalDateTime occurredAt = LocalDateTime.now();

    public LocalDateTime getOccurredAt() {
        return occurredAt;
    }
}
