package com.company.tasks;

import java.util.Scanner;

public class Task_2_14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину первого катета: ");
        String inputA = console.next();
        System.out.print("Введите длину второго катета: ");
        String inputB = console.next();

        try {
            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);

            System.out.printf("Длина гипотенузы = %.2f", Math.sqrt(Math.abs(Math.pow(a, 2)) + Math.abs(Math.pow(b, 2))));
        }catch (Exception e) {
            System.out.print("Ошибка ввода");
        }
    }
}
