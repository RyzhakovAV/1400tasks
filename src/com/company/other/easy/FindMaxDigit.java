package com.company.other.easy;

import java.util.Arrays;
import java.util.Scanner;

/*
ЗАДАЧА
Вводятся три целых числа. Определить какое из них наибольшее.
 */
public class FindMaxDigit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] array = new int[3];
        int i = 0;
        while(i < array.length) {
            System.out.print("Введите число: ");
            String digit = console.next();
            try {
                array[i] = Integer.parseInt(digit);
                i++;
            }catch (Exception e) {
                System.out.println("Ошибка ввода, введите число");
            }
        }
        for (int number : array) {
            System.out.print(number + " ");
        }

        Arrays.sort(array);
        System.out.println("\nМаксимальное число: " + array[array.length - 1]);
    }
}
