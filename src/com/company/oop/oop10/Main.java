package com.company.oop.oop10;

public class Main {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(10, 2.3, 4.2, 5.6);
        BoxWeight box2 = new BoxWeight(20, 10.3, 10.2, 12.9);
        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(10, 32);
        Box box5 = new Box(10);
        Box box6 = new Box(20);
        BoxWeight box7 = new BoxWeight(box5, box6, 34);

        System.out.println(box1.getWeight());

        box1.showInfo();
        box2.showInfo();
        box3.showInfo();
        box4.showInfo();
        box5.showInfo();
        box6.showInfo();
        box7.showInfo();
    }
}
