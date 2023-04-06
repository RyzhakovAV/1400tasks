package com.company;

import java.util.Scanner;

public class Task_1_09 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String message = " – вот какое число Вы ввели";
        String messageIn = console.nextLine();
        System.out.println(messageIn + message);
    }
}
