package com.company.tasks;

import java.util.Scanner;

public class Task_2_16 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите катет a = ");
        String inputA = console.next();
        System.out.print("Введите катет b = ");
        String inputB = console.next();

        try {
            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);
            if (a <= 0 || b <=0) {
                System.out.println("Сторона треугольника не может быть меньше или равна нулю");
            }else {
                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                double P = a + b + c;
                System.out.printf("Длина катета a = %s. Длина катета b = %s. Длина гипотенузы c = %.2f. " +
                        "Площадь прямоугольного треугольника = %.2f", inputA, inputB, c, P);
            }
        }catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
