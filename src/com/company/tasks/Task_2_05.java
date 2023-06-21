package com.company.tasks;

import java.util.Scanner;
public class Task_2_05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            System.out.print("Введите радиус окружности: ");
            double R = console.nextDouble();
            System.out.printf("Диаметр равен %.2f при радиусе равном %.2f", R*2, R);
        }catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
