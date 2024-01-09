package org.academy.toyota.car.solara;

public class Refrigerator {


    public void on(Drink drink) {
        drink.setCold(true);
    }

    public void off(Drink drink) {
        drink.setCold(false);
    }
}
