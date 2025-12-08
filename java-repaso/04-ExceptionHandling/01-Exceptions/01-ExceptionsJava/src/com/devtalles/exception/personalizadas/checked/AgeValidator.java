package com.devtalles.exception.personalizadas.checked;

public class AgeValidator {
    public static void main(String[] args) {
        Person person = null;
        try {
            person = Person.createPerson("Daniel", 15);
            System.out.println(person.toString());
        } catch (AgeValidationException e) {
//            throw new RuntimeException(e);
            System.out.println("Error: " + e.getMessage());
        }
    }
}
