package com.devtalles.exception.basic;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {

        int age = -5;

        try {
            validateAge(age);
            System.out.println("Edad válida. Continuando con el programa...");
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Programa finalizado correctamente.");
    }

    // Método que valida y lanza la excepción
    private static void validateAge(int age) {
        if (age < 0) {
            throw new InvalidAgeException("La edad no puede ser negativa: " + age);
        }
    }
}
