package com.company.other.easy;

/*
Найти номер минимального по модулю элемента массива.
Например, в массиве [10, -3, -5, 2, 5] минимальным по модулю элементом является число 2.
 */

public class MinModul {
    public static void main(String[] args) {
        int[] array = new int[10];
        int min;
        int index = 0;
        int count = 0;
        String indexes = "";

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 20 - 10);
        }

        min = Math.abs(array[index]);

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if(Math.abs(array[i]) < min) {
                min = Math.abs(array[i]);
                index = i;
            }
        }

        for(int i = 0; i < array.length; i++) {
            if(Math.abs(array[i]) == min) {
                indexes += i + " ";
                count++;
            }
        }

        if(count > 1) {
            System.out.printf("%nМинимальное число: %d. Число встречается на позициях: %s", min, indexes);
        }else{
            System.out.printf("%nМинимальное число: %d, на позиции: %d", min, index);
        }
    }
}
