package org.academy.toyota.manager;

import org.academy.toyota.car.camry.Camry;
import org.academy.toyota.consumer.Consumer;
import org.academy.toyota.abstractCar.Car;
import org.academy.toyota.factory.AssemblyLine;
import org.academy.toyota.warehouse.Warehouse;

public class Manager {

    public Car sell(Warehouse warehouse, AssemblyLine assemblyLine, Consumer consumer) {
        System.out.println("Working with consumer named : " + consumer.getName() + "; денег "+ consumer.getMoney());
        Car carForConsumer = null;
        Price price = null;
        double tmpPrice = 0;
        //ищем в прайслисте подходящий автомобиль
        for (int i = 0; i < Price.values().length; i++) {
            if (Price.values()[i].getPrice() <= consumer.getMoney() &&
                    Price.values()[i].getPrice() > tmpPrice) {
                price = Price.values()[i];
                tmpPrice = Price.values()[i].getPrice();
            }
        }
        System.out.println("Consumer choose : " + price.getName());
        /*if (tmpPrice == 0) {
            System.out.println("Покупатель уходит ни с чем");
            return null;
        }*/
        //проверяем на складе наличие автомобиля
        carForConsumer = seekCar(warehouse, price, carForConsumer);
        if (carForConsumer == null) {
            System.out.println("zzzzzzzzzzzzzzzzzzzzz");
            System.out.println("before adding : " + warehouse.getCarCount());
            System.out.println("zzzzzzzzzzzzzzzzzzzzz");
            warehouse.addCar(sayToAssembly(warehouse, assemblyLine));
            System.out.println("zzzzzzzzzzzzzzzzzzzzz");
            System.out.println("after ADDING : " + warehouse.getCarCount());
            System.out.println("zzzzzzzzzzzzzzzzzzzzz");
            carForConsumer = seekCar(warehouse, price, carForConsumer);
        }
        System.out.println(warehouse.getCarCount());

        return carForConsumer;
    }

    //запрос на производство в случае отсутствия авто за нужную сумму
    public Car sayToAssembly(Warehouse warehouse, AssemblyLine assemblyLine) {
        if (warehouse.showCamryAmount() == 0) {
           return assemblyLine.createCamry("black", 10000);
        }
        if (warehouse.showDynaAmount() == 0) {
           return assemblyLine.createDyna("black", 22000);
        }
        if (warehouse.showHianceAmount() == 0) {
           return assemblyLine.createHiance("black", 15000);
        }
        if (warehouse.showSolaraAmount() == 0) {
           return assemblyLine.createSolara("white", 12000);
        }
        return null;
    }

    public Car seekCar(Warehouse warehouse, Price price, Car carForConsumer) {
        for (int i = 0; i < warehouse.getCars().length; i++) {
            if(warehouse.getCars()[i] != null &&
                    warehouse.getCars()[i].getClass().getSimpleName().equals(price.getName()) &&
                    warehouse.getCars()[i].getPrice() == price.getPrice()) {
                carForConsumer =  warehouse.takeCar(warehouse.getCars()[i]);
                System.out.println("-------------");
                System.out.println("after taking : " + warehouse.getCarCount());
                System.out.println("-------------");
                break;
            }
        }
        return carForConsumer;
    }
}
