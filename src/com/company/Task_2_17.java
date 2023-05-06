package com.company;

import java.util.Scanner;

public class Task_2_17 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите высоту трапеции h: ");
        String inputH = console.next();
        System.out.print("Введите длину основания трапеции a: ");
        String inputA = console.next();
        System.out.print("Введите длину основания трапеции b: ");
        String inputB = console.next();
        try {
            double h = Math.abs(Double.parseDouble(inputH));
            double a = Math.abs(Double.parseDouble(inputA));
            double b = Math.abs(Double.parseDouble(inputB));
            double S = ((a + b) / 2) * h;
            double P = a + b + 2 * Math.sqrt(Math.pow(h, 2) + Math.pow(a - b, 2) / 4);
            System.out.printf("Площадь равнобедренной трапеции равна %.2f", S);
            System.out.printf("\nПериметр равнобедренной трапеции равна %.2f", P);
        }catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
