package org.academy.toyota.abstractcar;

import org.academy.toyota.abstractcar.option.Top;
import org.academy.toyota.car.details.*;
import org.academy.toyota.factory.Country;

public abstract class Cabriolet extends Car {
    private Top top;

    public Cabriolet(String color, int maxSpeed, Transmission transmission,
                     boolean isDrive, Wheel[] wheels, Tank tank, Engine engine,
                     Electric electric, Light light, double price, Country country, Top top) {
        super(color, maxSpeed, transmission, isDrive,
                wheels, tank, engine, electric, light, price, country);
        this.top = top;
    }

    public Top getTop() {
        return top;
    }
}
