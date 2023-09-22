package com.company.oop.oop5;

public class Main {
    public static void main(String[] args) {
        Monstor monstor = new Monstor();
        Monstor monstor1 = new Monstor(3);
        Monstor monstor2 = new Monstor(2, 4);
        Monstor monstor3 = new Monstor(2, 2, 4);

        monstor.voice();
        System.out.println();
        monstor1.voice(5);
        monstor2.voice(2);
        monstor3.voice(4, "arrrh");
    }
}
