package com.detalles.restricciones;

public class Calculator<T extends Shape> {

    public double calculateArea(T shape) {
        return shape.area();
    }
}
