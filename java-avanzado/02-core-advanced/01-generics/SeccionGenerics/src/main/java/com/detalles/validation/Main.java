package com.detalles.validation;

public class Main {

    public static void main(String[] args) {

        User user = new User("daniel@mail.com", 22);
        Validator<User> validator = new UserValidator();

        ValidationResult result = validator.validate(user);

        if (result.isValid()) {
            System.out.println("User is valid");
        } else {
            System.out.println("Validation error: " + result.getMessage());
        }
    }
}
