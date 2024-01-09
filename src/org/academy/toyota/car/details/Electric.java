package org.academy.toyota.car.details;

import org.academy.toyota.abstractcar.StartCarException;

public class Electric {
    private boolean isWorkable;

    public Electric(boolean isWorkable) {
        this.isWorkable = isWorkable;
    }

    public boolean isWorkable() throws StartCarException {
        if (!isWorkable) {
            throw new StartCarException("Проблема с электрикой");
        }
        return true;
    }
}
