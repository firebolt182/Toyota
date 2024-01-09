package org.academy.toyota.dealernet.manager;

import org.academy.toyota.abstractcar.Car;

public class Report {

    private String managerName;

    public Report(String managerName) {
        this.managerName = managerName;
    }

    private Car[] soldCars = new Car[100];

    public Car[] getSoldCars() {
        return soldCars;
    }

    public String getManagerName() {
        return managerName;
    }

    public void addSoldCar(Car car) {
        for (int i = 0; i < soldCars.length; i++) {
            if (soldCars[i] == null) {
                soldCars[i] = car;
                break;
            }
        }
    }
}
