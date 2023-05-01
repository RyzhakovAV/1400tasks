package com.company;

 import java.util.Scanner;
public class Task_2_03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input a: ");
        String a = console.next();
        double digitA = Double.parseDouble(a);
        double equals1 = Math.sqrt((2 * digitA + Math.sin(Math.abs(3 * digitA)))/(3.56));
        System.out.printf("Output: %.2f\n", equals1);
        System.out.print("Input x: ");
        String x = console.next();
        double digitX = Double.parseDouble(x);
        double equals2 = Math.sin((3.2 + Math.sqrt(1 + digitX))/(Math.abs(5 * digitX)));
        System.out.printf("Output: %.2f\n", equals2);
    }
}
