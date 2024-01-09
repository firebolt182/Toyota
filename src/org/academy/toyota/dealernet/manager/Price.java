package org.academy.toyota.manager;

public enum Price {
    CAMRY_BLACK("Camry", 10000),
    SOLARA_WHITE("Solara", 12000),
    HIANCE_BLACK("Hiance", 15000),
    DYNA_BLACK("Dyna", 22000);

    private String name;
    private double price;

    Price(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
