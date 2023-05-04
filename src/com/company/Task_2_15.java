package com.company;

import java.util.Scanner;
public class Task_2_15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        String inputA = console.next();
        System.out.print("Введите радиус второго круга: ");
        String inputB = console.next();
        try {
            double a = Math.abs(Double.parseDouble(inputA));
            double b = Math.abs(Double.parseDouble(inputB));
            double sA = Math.PI * Math.pow(a, 2);
            double sB = Math.PI * Math.pow(b, 2);
            if (a > b) {
                System.out.printf("Площадь кольца равна %.2f", sA - sB);
            }else if (a < b) {
                System.out.printf("Площадь кольца равна %.2f", sB - sA);
            }else{
                System.out.println("Площадь кольца равна 0");
            }
        }catch(Exception e) {

        }
    }
}
