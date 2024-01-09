package org.academy.toyota.car;

import org.academy.toyota.abstractCar.TownCar;
import org.academy.toyota.abstractCar.option.CruiseControl;
import org.academy.toyota.car.details.*;
import org.academy.toyota.car.option.UsbPort;

public class Camry extends TownCar {
    private UsbPort usbPort;

    public Camry(String color, int maxSpeed, Transmission transmission, boolean isDrive,
                 Wheel[] wheels, Tank tank, Engine engine, Electric electric,
                 Light light, double price, CruiseControl cruiseControl, UsbPort usbPort) {
        super(color, maxSpeed, transmission, isDrive, wheels,
                tank, engine, electric, light, price, cruiseControl);
        this.usbPort = usbPort;
    }
}
