package org.academy.toyota.car.solara;

import org.academy.toyota.car.option.Enable;

public class Refregerator implements Enable {
    private Drink drink;

    public Refregerator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void on() {
        drink.setCold(true);
    }

    @Override
    public void off() {
    drink.setCold(false);
    }
}
