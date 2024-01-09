package org.academy.toyota.car;

public class StartCarException extends Exception{
    public StartCarException() {
        System.out.println("Не может поехать (внести причины)");
    }
}
