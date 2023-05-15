package com.company;

import java.util.Random;

public class Boxes {
    static int[] arrayBoxes = new int[100];
    static int[] arrayPeople = new int[100];
    static Random rnd = new Random();
    static int sumFind = 0;
    static int resultOrder = 0;

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

    public static int findBoxOrder(int[] array, int man) {
        int ticket = man;
        for(int i = 1; i < 50; i ++) {
            if (man == array[ticket]) {
                return 1;
            }else{
                ticket = array[ticket];
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        fillArray(arrayBoxes);
        fillArray(arrayPeople);

        for(int i = 0; i < 1_000_000; i++) {
            mixArray(arrayBoxes);

            sumFind = 0;
            for(int j = 0; j < arrayPeople.length; j++) {
                sumFind += findBoxOrder(arrayBoxes, j);
                if(sumFind == 100) {
                    resultOrder++;
                }
            }
            System.out.println(sumFind);
        }


        System.out.println("Результат выживания при условии что заключенный открывает первую коробку со своим номером");
        resultOrder *= 0.0001;
        System.out.println("и по номеру в коробке открывает следующию : " + resultOrder + " %");
    }
}