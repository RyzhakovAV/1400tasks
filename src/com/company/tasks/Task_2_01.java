package com.company.tasks;

import java.util.Scanner;

public class Task_2_01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = console.nextInt();
        System.out.println("Введите число a: ");
        int a = console.nextInt();
        int findX = 17 * x * x - 6 * x + 13;
        int findA = 3 * a * a + 5 * a - 21;
        System.out.printf("y = 17x^2 - 6x + 13, y = %d, при x = %d\n", findX, x);
        System.out.printf("y = 3a^2 + 5a - 21, y = %d, при a = %d", findA, a);

    }
}
