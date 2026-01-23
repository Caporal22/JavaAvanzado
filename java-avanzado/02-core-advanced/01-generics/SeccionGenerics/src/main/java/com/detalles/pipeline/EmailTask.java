package com.detalles.pipeline;

public class EmailTask {

    private final String recipient;
    private final String message;

    public EmailTask(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }
}
