package org.academy.toyota.car;

public abstract class Cabriolet extends Car{
    private boolean isTopUp;

    public boolean isTopUp() {
        return isTopUp;
    }

    public void setTopUp(boolean topUp) {
        isTopUp = topUp;
    }

    //крышу вверх
    public void topUp() {
     setTopUp(true);
    }

    //крышу вниз
    public void topDown() {
        setTopUp(false);
    }
}
