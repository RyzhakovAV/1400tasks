package com.company.tasks;

import java.util.Scanner;
public class Task_2_04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите сторону квадрата: ");
        String a = console.next();

        try {
            float digitA = Float.parseFloat(a);
            float P = (digitA + digitA) * 2;
            System.out.printf("Периметр для квадрата со стороной %s равен %.2f", a, P);
        }catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
