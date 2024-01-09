package org.academy.toyota.car.details;

import org.academy.toyota.abstractcar.StartCarException;

public class Tank {
    private int fuelLeft;

    public Tank(int fuelLeft) {
        this.fuelLeft = fuelLeft;
    }

    public boolean notEmpty() throws StartCarException {
        if (fuelLeft <= 0) {
            throw new StartCarException("Пустой бензобак");
        } else {
          return true;
        }
    }
}

