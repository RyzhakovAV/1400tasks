package com.company.oop.oop12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Aleksandr");
        Developer developer2 = new Developer("Стиф Джобс");
        Developer developer3 = new Developer("Ivan Pupkin");
        Driver driver1 = new Driver("Svetlana");
        Driver driver2 = new Driver("Nikolay");
        Driver driver3 = new Driver("Petr");
        Cooker cooker1 = new Cooker("Kima");
        Cooker cooker2 = new Cooker("Maria");
        Cooker cooker3 = new Cooker("Vasiliy");

        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(developer1);
        workerList.add(developer2);
        workerList.add(developer3);
        workerList.add(driver1);
        workerList.add(driver2);
        workerList.add(driver3);
        workerList.add(cooker1);
        workerList.add(cooker2);
        workerList.add(cooker3);

        for (Worker worker : workerList) {
            worker.voice();
        }

        ArrayList<Developer> developers = new ArrayList<>();
        ArrayList<Driver> drivers = new ArrayList<>();
        ArrayList<Cooker> cookers = new ArrayList<>();

        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        cookers.add(cooker1);
        cookers.add(cooker2);
        cookers.add(cooker3);

        for (Developer developer : developers) {
            developer.programming();
        }

        for (Driver driver : drivers) {
            driver.driving();
        }

        for (Cooker cooker : cookers) {
            cooker.cooking();
        }
    }
}
