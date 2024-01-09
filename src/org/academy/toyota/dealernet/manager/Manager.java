package org.academy.toyota.dealernet.manager;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.academy.toyota.abstractcar.Car;
import org.academy.toyota.consumer.Consumer;
import org.academy.toyota.dealernet.Cashier.Cashier;
import org.academy.toyota.factory.AssemblyLine;
import org.academy.toyota.warehouse.Warehouse;

public class Manager {
    private String name;
    private Car carForConsumer;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Car sell(Warehouse warehouse, AssemblyLine assemblyLine, Consumer consumer) {
        carForConsumer = null;
        //в эту переменную запишем авто из прайслиста,которое подходит по цене
        Price carFromPrice = null;
        double tmpPrice = 0;
        //ищем в прайслисте подходящий автомобиль
        for (int i = 0; i < Price.values().length; i++) {
            if (Price.values()[i].getPrice() <= consumer.getMoney()
                    && Price.values()[i].getPrice() > tmpPrice) {
                carFromPrice = Price.values()[i];
                tmpPrice = Price.values()[i].getPrice();
            }
        }
        //проверяем на складе наличие автомобиля
        carForConsumer = seekCar(warehouse, carFromPrice);
        //Если на складе авто отсутствует
        if (carForConsumer == null) {
            //делаем запрос производству, попутно добавляем на склад этот автомобиль
            warehouse.addCar(queryToAssembly(assemblyLine, carFromPrice.getName()));
            //берем со склада автомобиль
            carForConsumer = seekCar(warehouse, carFromPrice);
        }
        return carForConsumer;
    }

    //запрос на производство в случае отсутствия авто за нужную сумму
    public Car queryToAssembly(AssemblyLine assemblyLine, String model) {
        switch (model) {
            case "Camry":
                return assemblyLine.createCamry(10000, "black");
            case "Dyna":
                return assemblyLine.createDyna(22000, "black");
            case "Hiance":
                return assemblyLine.createHiance(15000, "black");
            case "Solara":
                return assemblyLine.createSolara(12000, "white");
        }
        return null;
    }

    public Car seekCar(Warehouse warehouse, Price price) {
        for (int i = 0; i < warehouse.getCars().length; i++) {
            if (warehouse.getCars()[i] != null
                    && warehouse.getCars()[i].getClass().getSimpleName().equals(price.getName())
                    && warehouse.getCars()[i].getPrice() == price.getPrice()) {
                carForConsumer = warehouse.takeCar(warehouse.getCars()[i]);
                break;
            }
        }
        return carForConsumer;
    }

    public void generateStatistics(Report report) throws FileNotFoundException {
        double countExpenses = 0;
        try (PrintWriter writer = new PrintWriter("resources/report.txt")) {
            writer.println(report.getManagerName());
            for (int i = 0; i < report.getSoldCars().length; i++) {
                if (report.getSoldCars()[i] != null) {
                    countExpenses += showExpenses(report.getSoldCars()[i]);
                    writer.printf("%s - %6.2f - %6.2f\n",
                            report.getSoldCars()[i].getClass().getSimpleName(),
                            report.getSoldCars()[i].getPrice(),
                            showExpenses(report.getSoldCars()[i]));
                }
            }
            writer.printf("Итог: Доходы - %5.2f, Расходы - %6.2f, Прибыль - %6.2f\n",
                    Cashier.getProfit(), countExpenses, Cashier.getProfit() - countExpenses);
            writer.flush();
        }

    }

    public double showExpenses(Car car) {
        switch (car.getClass().getSimpleName()) {
            case "Camry":
                return Price.CAMRY_BLACK.getExpenses();
            case "Dyna":
                return Price.DYNA_BLACK.getExpenses();
            case "Hiance":
                return Price.HIANCE_BLACK.getExpenses();
            case "Solara":
                return Price.SOLARA_WHITE.getExpenses();
        }
        return 0;
    }
}
