package org.academy.toyota.car;

public class Wheel {
    private boolean isBroken;
    private int diameter;

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Wheel(boolean isBroken, int diameter) {
        this.isBroken = isBroken;
        this.diameter = diameter;
    }

    public Wheel changeWheel(int diameter) throws WheelDiameterException {
        if (!(this.diameter == diameter)) {
            throw new WheelDiameterException();
        }
        return new Wheel(true,diameter);
    }
}
