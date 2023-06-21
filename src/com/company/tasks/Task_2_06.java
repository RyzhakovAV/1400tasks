package com.company.tasks;
/*
Считая, что Земля - идеальная сфера с радиусом 6350км, определить расстояние до линии горизонта от точки с заданной
высотой над Землей.
 */

import java.util.Scanner;

public class Task_2_06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int R = 3650 * 1000;
        try {
            System.out.print("Введите высоту над уровнем моря в метрах: ");
            double h = console.nextDouble();
            double distance = Math.sqrt(Math.pow(R + h, 2) - Math.pow(R, 2));
            System.out.printf("Расстояние до линии горизонта %.2f метров или %.2f километров", distance, distance / 1000);
        }catch (Exception e) {
            System.out.println("Error Input");
        }
    }
}
