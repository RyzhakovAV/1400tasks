package com.company.oop.oop6;

public class Box {
    double length;
    double width;
    double height;

    Box(double size) {
        length = size;
        width = size;
        height = size;
    }

    Box(double length ,double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box box1, Box box2) {
        this.length = box1.length + box2.length + 1.0;
        this.width = box1.width + box2.width + 1.0;
        this.height = box1.height + box2.height + 1.0;
    }

    Box newBox (Box box) {
        return new Box(this.length + box.length, this.width + box.width, this.height + box.height);
    }

    void info() {
        System.out.println("Длина: " + length + "\nШирина: " + width + "\nВысота: " + height);
    }

    void volume() {
        System.out.println("Объем: " + length * width * height);
    }
}
