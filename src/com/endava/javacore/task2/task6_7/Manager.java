package com.endava.javacore.task2.task6_7;

public class Manager extends Employee {
    public Manager() {
    }

    public Manager(int hours) {
        super(hours);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + ((super.getSalary() * 50) / 100);
    }
}
