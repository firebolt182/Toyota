package org.academy.toyota.car.details;

public class Light {
    private boolean isWorkable;

    public Light(boolean isWorkable) {
        this.isWorkable = isWorkable;
    }

    public boolean isWorkable() {
        return isWorkable;
    }

    public void setWorkable(boolean workable) {
        isWorkable = workable;
    }

}
