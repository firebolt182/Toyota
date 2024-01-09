package org.academy.toyota.car;

public class Electric implements Workable{
    private boolean isWorkable = true;

    @Override
    public boolean isWorkable() {
        return isWorkable;
    }

    public void setWorkable(boolean workable) {
        isWorkable = workable;
    }
}
