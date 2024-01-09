package org.academy.toyota.abstractcar;

import org.academy.toyota.abstractcar.option.CruiseControl;
import org.academy.toyota.car.details.*;
import org.academy.toyota.factory.Country;

public abstract class TownCar extends Car {
    private CruiseControl cruiseControl;

    public TownCar(String color, int maxSpeed, Transmission transmission,
                   boolean isDrive, Wheel[] wheels, Tank tank, Engine engine,
                   Electric electric, Light light, double price,
                   Country country, CruiseControl cruiseControl) {
        super(color, maxSpeed, transmission, isDrive,
                wheels, tank, engine, electric, light, price, country);
        this.cruiseControl = cruiseControl;
    }

    public CruiseControl getCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(CruiseControl cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

}
