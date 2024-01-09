package org.academy.toyota.car.duna;

import org.academy.toyota.abstractCar.Truck;
import org.academy.toyota.car.details.*;

public class Dyna extends Truck {
    private Socket socket;
    public Dyna(String color, int maxSpeed, Transmission transmission,boolean isDrive,
                Wheel[] wheels, Tank tank, Engine engine, Electric electric,
                Light light, double price, int loadCapacity, Socket socket) {
        super(color, maxSpeed, transmission, isDrive, wheels, tank,
                engine, electric, light, price, loadCapacity);
        this.socket = socket;
    }
}
