package com.company.oop.oop13;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Counter counter = new Counter();

        director.force(counter, 11);

        Director director1 = new Director();

        director1.force(new InterfaceCounter(){
            @Override
            public String count(int month) {
                return "Отчет за " + month + " месяцев";
            }
        }, 6);

    }
}
