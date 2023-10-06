package com.company.oop.oop8;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();

        employees.add("Aleksandr");
        employees.add("Nikolay");
        employees.add("Maria");
        employees.add("Evgeny");
        employees.add("Kima");
        employees.add("Leonid");
        employees.add("Anastasia");
        employees.add("Artem");
        employees.add("Andrey");
        employees.add("Svetlana");
        employees.add("Ivan");
        employees.add("Vlad");

        for (int i = 1; i <= 10; i++ ) {
            employees.add("Сотрудник " + i);
        }

        System.out.println(employees.getSize());


        employees.printArray();
        System.out.println("--------------TEST--------------");
        System.out.println(employees.findElement(4));
        System.out.println(employees.findElement("Maria"));
        System.out.println(employees.findElement(61));
        System.out.println(employees.getSize());
        employees.remove(65);
        employees.remove(11);
        employees.printArray();
        employees.remove("Leonid");
        employees.remove("Сотрудник 10");
        employees.printArray();
        System.out.println(employees.getSize());
    }
}
