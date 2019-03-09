package com.endava.javacore.task2.task1_2_8;

public class Circle extends GraphicObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
