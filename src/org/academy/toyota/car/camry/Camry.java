package org.academy.toyota.car.camry;

import org.academy.toyota.abstractcar.TownCar;
import org.academy.toyota.abstractcar.option.CruiseControl;
import org.academy.toyota.car.details.*;
import org.academy.toyota.factory.Country;

public class Camry extends TownCar {
    private UsbPort usbPort;

    public Camry(String color, int maxSpeed, Transmission transmission, boolean isDrive,
                 Wheel[] wheels, Tank tank, Engine engine, Electric electric,
                 Light light, double price, Country country,
                 CruiseControl cruiseControl, UsbPort usbPort) {
        super(color, maxSpeed, transmission, isDrive, wheels,
                tank, engine, electric, light, price, country, cruiseControl);
        this.usbPort = usbPort;
    }

    public CruiseControl getCruiseControl() {
        return super.getCruiseControl();
    }

    public UsbPort getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(UsbPort usbPort) {
        this.usbPort = usbPort;
    }

}
