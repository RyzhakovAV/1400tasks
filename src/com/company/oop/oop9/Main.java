package com.company.oop.oop9;

public class Main {
    public static void main(String[] args) {
        final String line = "Это Иван, ему 34 года, его рост 166.3 см. Должность программист.";
        String name = line.substring(4, 8);
        int age = Integer.parseInt(line.substring(14, 16));
        double height = Double.parseDouble(line.substring(32,37));
        String position = line.substring(52, 63);
        Man employee = new Man(name, position, age, height);

        System.out.println(employee);
    }
}
