package com.company.oop.oop10;

public class BoxWeight extends Box{
    private double weight;

    public BoxWeight() {
        super();
        weight = 0;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public BoxWeight(double height, double width, double length, double weight) {
        super(height, width, length);
        this.weight = weight;
    }

    public BoxWeight(Box box1, Box box2, double weight) {
        super(box1, box2);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight);
    }
}
