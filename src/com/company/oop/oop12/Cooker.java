package com.company.oop.oop12;

public class Cooker extends Worker implements InterfaceCanCooking{
    public Cooker(String name) {
        super(name);
    }
    @Override
    public void voice() {
        System.out.println(getName());
    }

    @Override
    public void cooking() {
        System.out.println("Я готовлю еду");
    }
}
