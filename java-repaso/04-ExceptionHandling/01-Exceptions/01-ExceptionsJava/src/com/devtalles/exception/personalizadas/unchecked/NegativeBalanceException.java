package com.devtalles.exception.personalizadas.unchecked;

public class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}
