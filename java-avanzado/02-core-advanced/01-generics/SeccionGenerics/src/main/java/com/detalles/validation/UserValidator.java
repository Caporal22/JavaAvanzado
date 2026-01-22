package com.detalles.validation;

public class UserValidator implements Validator<User> {

    @Override
    public ValidationResult validate(User user) {

        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            return ValidationResult.fail("Invalid email format");
        }

        if (user.getAge() < 18) {
            return ValidationResult.fail("User must be at least 18 years old");
        }

        return ValidationResult.ok();
    }
}
