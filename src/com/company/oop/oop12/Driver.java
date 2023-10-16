package com.company.oop.oop12;

public class Driver extends Worker implements InterfaceCanDriving {

    public Driver(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName());
    }

    @Override
    public void driving() {
        System.out.println("Я вожу автомобиль");
    }
}
