package com.company.oop.oop13;

public class Counter implements InterfaceCounter{
    @Override
    public String count(int month) {
        return "Отчет за " + month + " месяцев";
    }
}
