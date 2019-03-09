package com.endava.javacore.task2.task1_2_8;

public class Main {
    public static void main(String []args) {
        Square square = new Square(4);
        System.out.println("(overridden method)Area of the square is : " + square.area());

        Circle circle = new Circle(7);
        System.out.println("(overridden method)Area of the circle is : " + circle.area());

    }
}
