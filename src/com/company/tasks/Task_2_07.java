package com.company.tasks;
/*
Дана длна ребра куба. Найти объем куба и площать его боковой поверхности
 */
import java.util.Scanner;

public class Task_2_07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите длину ребра куба: ");
        try {
            double a = console.nextDouble();
            System.out.printf("Для куба с длиной ребра %.2f. Объем равен: %.2f. Площадь поверхности: %.2f",
                    a, Math.pow(a, 3), Math.pow(a, 2));
        }catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
