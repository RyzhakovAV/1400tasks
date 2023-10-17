package com.company.other;

public class Random {
    public static void main(String[] args) {
        int random = (int)(Math.random() * 90 + 10);
        System.out.println(String.format("Случайное число %d. Попробуйте еще раз", random));
    }
}
