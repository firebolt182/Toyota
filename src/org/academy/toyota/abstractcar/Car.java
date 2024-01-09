package org.academy.toyota.abstractcar;

import org.academy.toyota.car.details.*;
import org.academy.toyota.factory.Country;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private Transmission transmission;
    private boolean isDrive = false;
    private Wheel[] wheels;
    private Tank tank;
    private Engine engine;
    private Electric electric;
    private Light light;
    private double price;
    private Country country;

    public Car(String color, int maxSpeed, Transmission transmission, boolean isDrive, Wheel[] wheels, Tank tank,
               Engine engine, Electric electric, Light light, double price, Country country) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.isDrive = isDrive;
        this.wheels = wheels;
        this.tank = tank;
        this.engine = engine;
        this.electric = electric;
        this.light = light;
        this.price = price;
        this.country = country;
    }

    //Проверяет работоспособность узлов
    public void start() {
        //isDrive должно быть true
        try {
            wheelsReady();
            tank.notEmpty();
            electric.isWorkable();
            engine.isWorkable();
            isDrive = true;
        } catch (StartCarException e) {
            e.getMessage();
        }
    }

    public void stop() {
        isDrive = false;
    }

    public boolean wheelsReady() throws StartCarException {
        for (Wheel wheel : wheels) {
            if (wheels.length != 4 || wheel.isBroken()) {
                throw new StartCarException("Проблема с колесами");
            }
        }
        return true;
    }

    //Включить фары
    public void turnLightsOn() {
        light.setWorkable(true);
    }

    public double getPrice() {
        return price;
    }
}
