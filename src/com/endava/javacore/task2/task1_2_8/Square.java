package com.endava.javacore.task2.task1_2_8;

public class Square extends GraphicObject{
    private double sideLength;

    public Square() {
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getPerimeter() {
        return sideLength * 4;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }
}
