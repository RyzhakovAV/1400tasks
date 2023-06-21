package com.company.tasks;

import java.util.Scanner;

public class Task_2_09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        String inputX = console.next();
        System.out.print("Введите значение y: ");
        String inputY = console.next();
        System.out.print("Введите значение a: ");
        String inputA = console.next();
        System.out.print("Введите значение b: ");
        String inputB = console.next();
        try {
            double x = Double.parseDouble(inputX);
            double y = Double.parseDouble(inputY);
            double z = 2 * Math.pow(x, 3) - 3.44 * x * y + 2.3 * Math.pow(x, 2) - 7.1 * y + 2;
            System.out.printf("При x = %s, y = %s. z равно %.2f", inputX, inputY, z);

            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);
            double w = 3.14 * Math.pow(a + b, 3) + 2.75 * Math.pow(b, 2) - 12.7 * a - 4.1;
            System.out.printf("\nПри a = %s, b = %s. x равно %.2f", inputA, inputB, w);
        }catch(Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
