package com.company.tasks;

import java.util.Scanner;
public class Task_1_13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int numberAfter = number + 1;
        int numberBefore = number - 1;
        System.out.printf("Следующее за числом %d число – %d.\n", number, numberAfter);
        System.out.printf("Для числа %d предыдущее число – %d.\n", number,numberBefore);

    }
}
