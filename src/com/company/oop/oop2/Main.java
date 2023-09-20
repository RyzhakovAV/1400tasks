package com.company.oop.oop2;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.name = "Лаки";
        myDog.species = "Овчарка";
        myDog.speed = 4;

        System.out.println(myDog.info());
        myDog.run();
    }
}
