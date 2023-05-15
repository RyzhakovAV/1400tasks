package com.company;

import java.util.Random;

public class Boxes {
    static int[] arrayBoxes = new int[100];
    static int[] arrayPeople = new int[100];
    static Random rnd = new Random();
    static int sumFind = 0;

    public static void fillArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void mixArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }


    public static void main(String[] args) {

        fillArray(arrayBoxes);
        fillArray(arrayPeople);

        mixArray(arrayBoxes);

        printArray(arrayBoxes);
        printArray(arrayPeople);



    }
}