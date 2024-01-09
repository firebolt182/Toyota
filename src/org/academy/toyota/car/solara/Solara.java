package org.academy.toyota.car.solara;

import org.academy.toyota.abstractcar.Cabriolet;
import org.academy.toyota.abstractcar.option.Top;
import org.academy.toyota.car.details.*;
import org.academy.toyota.factory.Country;

public class Solara extends Cabriolet {
    private Refrigerator refrigerator;

    public Solara(String color, int maxSpeed, Transmission transmission, boolean isDrive,
                  Wheel[] wheels, Tank tank, Engine engine, Electric electric,
                  Light light, double price, Country country,
                  Top top, Refrigerator refrigerator) {
        super(color, maxSpeed, transmission, isDrive, wheels, tank, engine, electric,
                light, price, country, top);
        this.refrigerator = refrigerator;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }
}
