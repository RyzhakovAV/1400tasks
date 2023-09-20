package com.company.oop.oop2;

public class Dog {
    String name;
    String species;
    int speed;

    void run() {
        for (int i = 1; i <= speed; i++) {
            System.out.print("бегу ");
        }
    }

    String info() {
        return "Кличка: " + name + "\nПорода: " + species + "\nСкорость: " + speed;
    }
}
