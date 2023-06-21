package com.company.tasks;

import java.util.Scanner;

public class Task_2_11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите объем в см^3: ");
        String inputV = console.next();
        System.out.print("Введите массу в граммах: ");
        String inputM = console.next();

        try {
            double V = Double.parseDouble(inputV);
            double M = Double.parseDouble(inputM);

            System.out.printf("Плотность равна: %.2f гр/см^3", M / V);
        }catch(Exception e) {

        }
    }
}
