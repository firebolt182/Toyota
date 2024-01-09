package org.academy.toyota.car.duna;

import org.academy.toyota.car.option.Enable;

public class Phone implements Enable {
    private boolean charge;

    @Override
    public void on() {
        charge = true;
    }

    @Override
    public void off() {
        charge = false;
    }
}
