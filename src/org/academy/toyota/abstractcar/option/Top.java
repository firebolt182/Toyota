package org.academy.toyota.abstractcar.option;

public class Top {
    private boolean isTopDown;

    public void topUp() {
        isTopDown = false;
    }

    public void topDown() {
        isTopDown = true;
    }
}
