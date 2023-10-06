package com.company.oop.oop9;

public class Man {
    private final String name;
    private final String position;
    private final int age;
    private final double height;

    public Man(String name, String position, int age, double height) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Man{" +
                "\nname = '" + name + '\'' +
                ",\nposition = '" + position + '\'' +
                ",\nage = " + age +
                ",\nheight = " + height +
                "\n}";
    }
}
