package com.endava.javacore.task2.task6_7;

public class UseEmployee {
    public static void main(String []args) {
        Employee employee = new Employee(45);

        System.out.println("Tariff per hour: " + employee.getTariffPerHour());
        System.out.println("Salary: " + employee.getSalary());

        Manager manager = new Manager(34);
        System.out.println("Tariff per hour: " + manager.getTariffPerHour());
        System.out.println("Salary: " + manager.getSalary());
    }
}
