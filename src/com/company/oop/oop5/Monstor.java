package com.company.oop.oop5;

public class Monstor {
    int eyes;
    int legs;
    int hands;

    public Monstor() {
        eyes = 2;
        legs = 2;
        hands = 2;
    }

    public Monstor(int eyes) {
        this.eyes = eyes;
        legs = 2;
        hands = 2;
    }

    public Monstor(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
        hands = 2;
    }

    public Monstor(int eyes, int legs, int hands) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }

    public void voice() {
        System.out.print("голос ");
    }

    public void voice(int i) {
        for (int j = 0; j <= i; j++) {
            voice();
        }
        System.out.println();
    }

    public void voice(int i, String word) {
        for (int j = 0; j <= i; j++) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
