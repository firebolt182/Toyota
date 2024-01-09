package org.academy.toyota.car.details;

public class Wheel {
    private boolean isBroken;
    private int diameter;

    public Wheel(boolean isBroken, int diameter) {
        this.isBroken = isBroken;
        this.diameter = diameter;
    }

    public boolean isBroken() {
        return isBroken;
    }

    //замена колеса
    public Wheel changeWheel(int diameter) throws WheelDiameterException {
        if (!(this.diameter == diameter)) {
            throw new WheelDiameterException();
        }
        return new Wheel(false, diameter);
    }
}
