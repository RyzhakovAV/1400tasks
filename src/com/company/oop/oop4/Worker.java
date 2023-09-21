package com.company.oop.oop4;

public class Worker {
    String name;
    String position;
    int salary;

    public Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String info(int month) {
        return "Имя: " + name + "\nДолжность: " + position + "\nзарплата за " + month + " месяцев: " +
                + month + salary;
    }
}
