package com.company;

import java.util.Scanner;

public class Task_2_16 {
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
            System.out.println("Площадь равнобедренной трапеции равна " + S);

        }catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
