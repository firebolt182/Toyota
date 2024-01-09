package org.academy.toyota.car;

import org.academy.toyota.abstractCar.Cabriolet;

public class Solara extends Cabriolet {
    private boolean hasRefregerator;

    public boolean isHasRefregerator() {
        return hasRefregerator;
    }

    public void setHasRefregerator(boolean hasRefregerator) {
        this.hasRefregerator = hasRefregerator;
    }
    public void makeDrinkCold(boolean hasRefregerator) {
        if (hasRefregerator) {
            System.out.println("Охлаждаю напиток");
        }
    }
}
