package com.company.tasks;
/*
Число π примерно равно 3,1415926. Вывести на экран это
число с тремя цифрами в дробной части. Текст '3.142' не использовать.
 */
public class Task_1_06 {
    public static void main(String[] args) {
        final double PI = 3.1415926d;
        System.out.printf("%.3f", PI);
    }
}
