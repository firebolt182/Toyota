package org.academy.toyota.car.hiance;

import org.academy.toyota.abstractcar.Truck;
import org.academy.toyota.car.details.*;
import org.academy.toyota.factory.Country;

public class Hiance extends Truck {
    private Wheel additionalWheel;

    public Hiance(String color, int maxSpeed, Transmission transmission, boolean isDrive,
                  Wheel[] wheels, Tank tank, Engine engine, Electric electric, Light light,
                  double price, Country country, int loadCapacity, Wheel additionalWheel) {
        super(color, maxSpeed, transmission, isDrive, wheels, tank, engine,
                electric, light, price, country, loadCapacity);
        this.additionalWheel = additionalWheel;
    }
}
