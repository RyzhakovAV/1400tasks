package com.company;

import java.util.Random;

public class Boxes {
    static int[] arrayBoxes = new int[100];
    static int[] arrayPeople = new int[100];
    static Random rnd = new Random();
    static int sumFindOrder = 0;
    static int sumFindRandom = 0;
    static int resultOrder = 0;
    static int resultRandom = 0;
    static int sumFirstRandom = 0;
    static int resultFirstRandom = 0;

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

    public static int findBoxFirstRandom(int[] array, int man) {
        int ticket = rnd.nextInt(0,100);;
        for(int i = 1; i < 50; i ++) {
            if (man == array[ticket]) {
                return 1;
            }else{
                ticket = array[ticket];
            }
        }
        return 0;
    }

    public static int findBoxRandom(int[] array, int man) {
        for(int i = 0; i < 50; i ++) {
            int ticket = rnd.nextInt(0,100);
            if (man == array[ticket]) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

        fillArray(arrayBoxes);
        fillArray(arrayPeople);

        for(int i = 0; i < 1_000_000; i++) {
            mixArray(arrayBoxes);

            sumFindOrder = 0;
            for(int j = 0; j < arrayPeople.length; j++) {
                sumFindOrder += findBoxOrder(arrayBoxes, j);
                if(sumFindOrder == 100) {
                    resultOrder++;
                }
            }
            System.out.println(sumFindOrder);
        }

        for(int i = 0; i < 1_000_000; i++) {
            mixArray(arrayBoxes);

            sumFindRandom = 0;
            for(int j = 0; j < arrayPeople.length; j++) {
                sumFindRandom += findBoxRandom(arrayBoxes, j);
                if(sumFindRandom == 100) {
                    resultRandom++;
                }
            }
            System.out.println(sumFindRandom);
        }

        for(int i = 0; i < 1_000_000; i++) {
            mixArray(arrayBoxes);

            sumFirstRandom = 0;
            for(int j = 0; j < arrayPeople.length; j++) {
                sumFirstRandom += findBoxFirstRandom(arrayBoxes, j);
                if(sumFirstRandom == 100) {
                    resultFirstRandom++;
                }
            }
            System.out.println(sumFirstRandom);
        }

        System.out.println("Результат выживания при условии что заключенный открывает первую коробку со своим номером");
        resultOrder *= 0.0001;
        System.out.println("и по номеру в коробке открывает следующию : " + resultOrder + " %");
        System.out.println("Результат выживания при условии что заключенный открывает случайную коробку");
        resultRandom *= 0.0001;
        System.out.println(resultRandom + " %");
        System.out.println("Результат выживания при условии что заключенный открывает первую случайную коробку");
        resultFirstRandom *= 0.0001;
        System.out.println("и по номеру в коробке открывает следующию : " + resultFirstRandom + " %");
    }
}