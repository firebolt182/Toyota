package org.academy.toyota.consumer;

public class Consumer {
    private String name;
    private double money;

    public Consumer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
