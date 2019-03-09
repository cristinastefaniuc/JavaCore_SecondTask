package com.endava.javacore.task2.task3;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
