package com.company.oop.oop8;

public class MyArrayList {
    private String[] arrayNamesEmployees = new String[10];
    private int size = 0;

    public void add(String name) {
        arrayNamesEmployees[size] = name;
        size++;
        if (size == arrayNamesEmployees.length) {
            String[] newArray = new String[arrayNamesEmployees.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = arrayNamesEmployees[i];
            }
            arrayNamesEmployees = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                arrayNamesEmployees[i] = arrayNamesEmployees[i + 1];
            }
            size--;
        } else {
            System.out.println("Element not find");
        }
    }

    public void remove(String name) {
        int index = findIndex(name);
        remove(index);
    }

    public String findElement(int index) {
        if (index >= 0 && index < size) {
            return arrayNamesEmployees[index];
        }
        return "Not find";
    }

    public String findElement(String name) {
        int index = findIndex(name);
        return findElement(index);
    }

    public void printArray() {
        System.out.println("------PRINT ARRAY------");
        for (int i = 0; i < size; i++) {
            System.out.println(arrayNamesEmployees[i]);
        }
    }

    private int findIndex(String element) {
        int ind = -1;
        for (int i = 0; i < size; i++) {
            if (element.equals(arrayNamesEmployees[i])) {
                ind = i;
                break;
            }
        }
        return ind;
    }

    public int getSize() {
        return size;
    }

}
