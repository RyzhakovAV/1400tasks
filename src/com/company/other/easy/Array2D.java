package com.company.other.easy;

public class Array2D {

    public static void fillArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 200) - 100;
            }
        }
    }

    public static void printArray(int[][] arr) {
        String dioganal = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
                if (i == j && arr[i][j] > 0) {
                    dioganal += arr[i][j] + " ";
                }
            }
            System.out.println();
        }
        System.out.println(dioganal);
    }
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        fillArray(array);
        printArray(array);
    }
}
