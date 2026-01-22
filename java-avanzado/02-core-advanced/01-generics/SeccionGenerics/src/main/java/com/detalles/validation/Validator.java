package com.detalles.validation;

public interface Validator<T> {
    ValidationResult validate(T target);
}
