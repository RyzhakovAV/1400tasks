package com.company.tasks;

import java.io.PrintStream;
import java.util.Scanner;

/*
Составить программу вывода на экран числа, вводимого с клавиатуры.
Выводимому числу должно предшествовать сообщение «Вы ввели число».
 */
public class Task_1_08 {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        System.out.print("Вы ввели число " + str);
    }
}
