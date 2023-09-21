package com.company.oop.oop3;

public class Rect {
    double length;
    double windth;

    Rect(double length, double windth) {
        this.length = length;
        this.windth = windth;
    }

    double perimeter() {
        return (length + windth) * 2;
    }

    double square() {
        return length * windth;
    }

}
