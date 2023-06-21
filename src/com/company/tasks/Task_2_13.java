package com.company.tasks;

import java.util.Scanner;

public class Task_2_13 {
    public static void main(String[] args) {
        System.out.println("ax + b = 0, a не равен 0");
        Scanner console = new Scanner(System.in);
        System.out.print("Введите a: ");
        String inputA = console.next();
        System.out.print("Введите b: ");
        String inputB = console.next();
        double x = 0;
        try {
            double a = Double.parseDouble(inputA);
            double b = Double.parseDouble(inputB);
            if (a == 0) {
                System.out.println("a не должно быть равной 0");
            }else {
                x = Math.abs(b / a);
                System.out.println("x = " + x);
            }
        }catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
