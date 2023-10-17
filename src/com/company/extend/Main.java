package com.company.extend;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        try{
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за предел массива");
        }
    }
}
