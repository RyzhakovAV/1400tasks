package com.company.oop.oop7;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(10, 15,15);
        Box box3 = box1.newBox(box2);
        Box box4 = new Box(box1, box2);

        box1.info();
        System.out.println();
        box2.info();
        System.out.println();
        box3.info();
        System.out.println();
        box4.info();
        System.out.println();

        box1.volume();
        box2.volume();
        box3.volume();
        box4.volume();
    }
}
