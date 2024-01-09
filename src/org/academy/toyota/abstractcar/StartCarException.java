package org.academy.toyota.abstractcar;

public class StartCarException extends Exception {
    public StartCarException(String message) {
        System.out.println(message);
    }
}
