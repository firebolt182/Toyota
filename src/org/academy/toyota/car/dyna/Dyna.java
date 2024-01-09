package org.academy.toyota.car.dyna;

import org.academy.toyota.abstractcar.Truck;
import org.academy.toyota.car.details.*;
import org.academy.toyota.factory.Country;

public class Dyna extends Truck {
    private Socket socket;

    public Dyna(String color, int maxSpeed, Transmission transmission,
                boolean isDrive, Wheel[] wheels, Tank tank, Engine engine,
                Electric electric, Light light, double price, Country country, int loadCapacity,
                 Socket socket) {
        super(color, maxSpeed, transmission, isDrive, wheels, tank,
                engine, electric, light, price, country, loadCapacity);
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }
}
