package org.academy.toyota.car.option;

public class Music implements Enable{
    private boolean musicConnect;

    @Override
    public void on() {
        musicConnect = true;
    }

    @Override
    public void off() {
        musicConnect = false;
    }
}
