package org.academy.toyota.dealernet.manager;

public enum Price {
    CAMRY_BLACK("Camry", 10000, 5000),
    SOLARA_WHITE("Solara", 12000, 8000),
    HIANCE_BLACK("Hiance", 15000, 10000),
    DYNA_BLACK("Dyna", 22000, 12000);

    private String name;
    private double price;
    private double expenses;

    Price(String name, double price, double expenses) {
        this.name = name;
        this.price = price;
        this.expenses = expenses;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getExpenses() {
        return expenses;
    }
}
