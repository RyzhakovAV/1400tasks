package com.company.study.colection;

import java.util.ArrayList;

public class TaskAboutArrayList {

    // ArrayList - изменяемый массив
    // HashSet - изменяемый массив с уникальными данными
    // TreeSet - изменяемый отсортированный массив с уникальными данными
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> finalList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        names.add("Aleksandr");
        names.add("Nikolay");
        names.add("Maria");
        names.add("Tamara");
        names.add("Kima");
        names.add("Artem");
        names.add("Andrey");
        names.add("Dmitriy");
        names.add("Alexey");
        names.add("Sergey");
        names.add("Ivan");

        names.remove(names.size() - 1);

        for (int i = 0; i < names.size(); i++) {
            finalList.add(numbers.get(i) + " - " + names.get(i));
        }

        for (String name : finalList) {
            System.out.println(name);
        }
    }

}
