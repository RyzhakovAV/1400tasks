package com.company.other.easy;


/*
ЗАДАЧА

Продемонстрировать возможности:
вывода данных в табличной форме (с выровненными столбцами),
выравнивания слева,
вывода вещественных чисел с заданным количеством знаков после запятой.
 */
public class Format {
    public static void main(String[] args) {
        int a = 1234;
        int b = 4321;
        double PI = Math.PI;
        double random = Math.random();
        String Hello = "Hello";
        String World = "World";

        System.out.printf("%s \t\t %s\n", Hello, World);
        System.out.printf("%d \t\t %d\n", a, b);
        System.out.printf("%.2f \t\t %.4f\n", PI, random);


        System.out.printf("%15s%n", Hello);
        System.out.printf("%.3s%n", World);
        System.out.printf("%13.3s%n", World);
        System.out.printf("%13.1s %.3s%n", Hello, World);

        System.out.printf("%,d%n", a);
        System.out.printf("%7d%n", b);
        System.out.printf("%07d%n", b);
        System.out.printf("%+07d%n", b);
        System.out.printf("%-,7d%n", b);

        System.out.printf("%f%n", PI);
        System.out.printf("%15f%n", PI);
        System.out.printf("%015f%n", PI);
        System.out.printf("%+015f%n", PI);
        System.out.printf("%.15f%n", PI);
        System.out.printf("%15.3f%n", PI);
        System.out.printf("%-15.3f%n", PI);
    }
}
