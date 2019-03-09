package com.endava.javacore.task2.task3;

public class Main {
    public static void main(String []args) {
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Jane", 21);

        System.out.println("The average age: " + (student1.getAge() + student2.getAge()) / 2);
    }
}
