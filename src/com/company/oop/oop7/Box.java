package com.company.oop.oop7;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double size) {
        length = size;
        width = size;
        height = size;
    }

    public Box(double length ,double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(Box box1, Box box2) {
        this.length = box1.length + box2.length + 1.0;
        this.width = box1.width + box2.width + 1.0;
        this.height = box1.height + box2.height + 1.0;
    }

    public Box newBox (Box box) {
        return new Box(this.length + box.length, this.width + box.width, this.height + box.height);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void info() {
        System.out.println("Длина: " + length + "\nШирина: " + width + "\nВысота: " + height);
    }

    public void volume() {
        System.out.println("Объем: " + length * width * height);
    }


}
