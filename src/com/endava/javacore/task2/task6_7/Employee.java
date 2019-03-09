package com.endava.javacore.task2.task6_7;

public class Employee {
    private double tariffPerHour = 5.5;
    public int hours;

    public Employee() {
    }

    public Employee(int hours) {
        this.hours = hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }

    public double getSalary() {
        return tariffPerHour * hours;
    }
}
