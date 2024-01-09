package org.academy.toyota.car.details;

import org.academy.toyota.abstractcar.StartCarException;

public class Engine {
    private boolean isWorkable = true;

    public Engine(boolean isWorkable) {
        this.isWorkable = isWorkable;
    }

    public boolean isWorkable() throws StartCarException {
        if (!isWorkable) {
            throw new StartCarException("Проблема с двигателем");
        }
        return true;
    }
}
