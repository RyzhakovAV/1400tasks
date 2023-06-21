package com.company.test;

public class Main {
    static int size = 10;
    public static void main(String[] args) {
        Closet closet1 = new Closet();

        for(int i = 0; i < size; i++) {
            closet1.add(new Book("Book", "Pushkin", i));
        }

        for ( Book i : closet1.closet) {
            System.out.println(i);
        }
    }


}
