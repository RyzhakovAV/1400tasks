package com.company.oop.oop12;

public abstract class Worker {
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void voice();
}
