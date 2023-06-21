package com.company.tasks;

import java.util.Scanner;

public class Task_2_02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите значение а: ");
        String a = console.next();
        float number = Float.parseFloat(a);
        double equals = (Math.pow(number, 2) + 10) / (Math.sqrt(Math.pow(number, 2) + 1));
        System.out.println(equals);
    }
}
