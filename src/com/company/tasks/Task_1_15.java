package com.company.tasks;

import java.util.Scanner;
public class Task_1_15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int inputNumber = 0;
        int[] arrayNumbers = new int[4];

        for(int i = 0; i < arrayNumbers.length; i++) {
            inputNumber = console.nextInt();
            arrayNumbers[i] = inputNumber;
        }

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(arrayNumbers[i] + " ");
        }
    }
}
