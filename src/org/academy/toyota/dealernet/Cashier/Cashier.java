package org.academy.toyota.dealernet.Cashier;

import org.academy.toyota.abstractcar.Car;

public class Cashier {
    private static double profit = 0;

    public void takeOrder(Car car) {
        profit += car.getPrice();
    }

    public static double getProfit() {
        return profit;
    }
}
