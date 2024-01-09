package org.academy.toyota.car;

public class Engine implements Workable{
    private boolean isWorkable = true;

    public boolean isWorkable() {
        return isWorkable;
    }

    public void setWorkable(boolean workable) {
        this.isWorkable = workable;
    }
}
