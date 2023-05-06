package com.company;

import java.util.Scanner;

public class Task_2_18 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите x = ");
        String inputX = console.next();
        System.out.print("Введите y = ");
        String inputY = console.next();

        try {
            double x = Double.parseDouble(inputX);
            double y = Double.parseDouble(inputY);

            double z = (x + (2 + y) / Math.pow(x, 2)) / (y + 1 / Math.sqrt(Math.pow(x, 2) + 10));
            double q = 7.25 * Math.sin(x) - Math.abs(y);

            System.out.printf("\nz = %.4f", z);
            System.out.printf("\nq = %.4f", q);

        }catch(Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
