package com.company.oop.oop11;

public class Main {
    public static void main(String[] args) {
        Rect rect1 = new Rect(10);
        Triangle triangle1 = new Triangle(2,3,4);

        System.out.println(rect1.area());
        System.out.printf("%.2f\n", triangle1.area());
    }
}
