package com.company;

import java.util.Scanner;
public class Task_2_08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        String inputR = console.next();
        try {
            double R = Double.parseDouble(inputR);
            double C = 2 * Math.PI * R;
            double S = Math.PI * Math.pow(R, 2);
            System.out.printf("При r = %s. Длина окружности будет равна %.2f, площадь круга равна %.2f", inputR, C, S);
        }catch(Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
