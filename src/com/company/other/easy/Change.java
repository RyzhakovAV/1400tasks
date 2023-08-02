package com.company.other.easy;
/*
Пользователь вводит два числа. Одно присваивается одной переменной, а второе — другой.
Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй, а второй — в первой.
 */

import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        String a = console.next();
        System.out.print("Введите второе значение: ");
        String b = console.next();

        System.out.printf("Введенные значения: %s, %s\n", a, b);

        String time = a;
        a = b;
        b = time;

        System.out.printf("Поменяные значения: %s, %s\n", a, b);
    }
}
