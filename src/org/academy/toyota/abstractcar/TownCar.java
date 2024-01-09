package org.academy.toyota.car;

public abstract class TownCar extends Car{
    private boolean hasCruiseControl;
    private boolean hasTurnedOn;

    public TownCar(boolean hasCruiseControl) {
        this.hasCruiseControl = hasCruiseControl;
    }
    public boolean turnOn() {
        if (hasCruiseControl) {
            return hasTurnedOn = true;
        } else {
            return false;
        }
    }

}
