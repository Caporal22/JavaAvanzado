package com.detalles.restricciones;

public class Main {

    public static void main(String[] args) {

        Calculator<Circle> circleCalculator = new Calculator<>();
        Calculator<Rectangle> rectangleCalculator = new Calculator<>();

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Circle area: " + circleCalculator.calculateArea(circle));
        System.out.println("Rectangle area: " + rectangleCalculator.calculateArea(rectangle));
    }
}
