package com.company.oop1;

public class Main {
    public static void main(String[] args) {
        Man man1 = new Man();
        Man man2 = new Man();
        Man man3 = new Man();
        Man man4 = new Man();
        Man man5 = new Man();
        man1.name = "Aleksandr";
        man1.age = 37;
        man1.weight = 82.2;
        man2.name = "Nikolay";
        man2.age = 33;
        man2.weight = 76;
        man3.name = "Maria";
        man3.age = 31;
        man3.weight = 65.8;
        man4.name = "Margarita";
        man4.age = 33;
        man4.weight = 73.1;
        man5.name = "Anastasia";
        man5.age = 27;
        man5.weight = 102.4;
        int ageAll = (man1.age + man2.age + man3.age + man4.age + man5.age) / 5;
        System.out.println(ageAll);
    }
}
