package org.academy.toyota.factory;

import org.academy.toyota.car.details.*;

public class Factory {
    private Country country;

    public Factory(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public Electric buildElectric() {
        return new Electric(true);
    }

    public Engine buildEngine() {
        return new Engine(true);
    }

    public Light buildLight() {
        return new Light(true);
    }

    public Tank buildTank() {
        return new Tank(0);
    }

    public Wheel[] buildWheels(int diameter) {
        Wheel[] wheels = {
            new Wheel(false, diameter),
            new Wheel(false, diameter),
            new Wheel(false, diameter),
            new Wheel(false, diameter)};
        return wheels;
    }
}
