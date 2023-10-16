package com.company.oop.oop12;

public class Developer extends Worker implements InterfaceCanProgramming {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName());
    }

    @Override
    public void programming() {
        System.out.println("Я пишу код");
    }
}
