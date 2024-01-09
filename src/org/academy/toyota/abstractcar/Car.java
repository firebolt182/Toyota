package org.academy.toyota.car;

import org.academy.toyota.car.details.*;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private Transmission transmission;
    private boolean isDrive;
    private Wheel[] wheels;
    private Tank tank;
    private Engine engine;
    private Electric electric;
    private Light light;
    private double price;
    public boolean start() throws StartCarException {
        if (!wheelsReady() || tank.isEmpty() || !electric.isWorkable() ||
                !engine.isWorkable()) {
            throw new StartCarException();
        } else {
            //service
            System.out.println("Car starts");
            return isDrive = true;
        }
    }

    public boolean wheelsReady() {
        if (wheels.length == 4) {
            for (Wheel wheel : wheels) {
                if (wheel.isBroken()) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }
    public boolean stop() {
        //service
        System.out.println("Car stops");
        return isDrive = false;
    }
    public void turnLightsOn() {
        //service
        System.out.println("Фары начали гореть");
        light.setWorkable(true);
    }
}
