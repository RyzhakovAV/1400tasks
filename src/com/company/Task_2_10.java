package com.company;

import java.util.Scanner;

public class Task_2_10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите x: ");
        String inputX = console.next();
        System.out.print("Введите y: ");
        String inputY = console.next();
        try {
            double x = Double.parseDouble(inputX);
            double y = Double.parseDouble(inputY);
            double midA = (x + y) / 2;
            double midG = Math.sqrt(x * y);
            System.out.printf("При x = %s, y = %s. Среднее арифметическое равно %.2f. Среднее геометрическое равно %.2f",
                    inputX, inputY, midA, midG);
        }catch(Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
