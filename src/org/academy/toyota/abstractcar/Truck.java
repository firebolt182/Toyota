package org.academy.toyota.abstractcar;

import org.academy.toyota.car.details.*;
import org.academy.toyota.factory.Country;

public abstract class Truck extends Car {
    private int loadCapacity;

    public Truck(String color, int maxSpeed, Transmission transmission,
                 boolean isDrive, Wheel[] wheels, Tank tank, Engine engine,
                 Electric electric, Light light, double price,
                 Country country, int loadCapacity) {
        super(color, maxSpeed, transmission, isDrive, wheels,
                tank, engine, electric, light, price, country);
        this.loadCapacity = loadCapacity;
    }
}
