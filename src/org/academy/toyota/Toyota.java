package org.academy.toyota;

import java.io.FileNotFoundException;
import org.academy.toyota.abstractcar.Car;
import org.academy.toyota.consumer.Consumer;
import org.academy.toyota.dealernet.Cashier.Cashier;
import org.academy.toyota.dealernet.DealerNet;
import org.academy.toyota.dealernet.manager.Manager;
import org.academy.toyota.dealernet.manager.Report;

public class Toyota {

    public void init() {
        DealerNet dealerNet = new DealerNet();
        dealerNet.createCars();
        Manager manager = new Manager("Luke");
        Cashier cashier = new Cashier();
        Report report = new Report(manager.getName());
        Consumer[] consumers = {
            new Consumer("Alan", 10000),
            new Consumer("Bob", 12000),
            new Consumer("Carl", 15000),
            new Consumer("Derek", 22000),
            new Consumer("Eddy", 11000),
            new Consumer("Frank", 10000),
            new Consumer("Greg", 8000),
            new Consumer("Hwang", 30000),
        };
        for (Consumer consumer : consumers) {
            //Исключение возникнет,если у покупателя не будет хватать средств
            try {
                Car celled = manager.sell(dealerNet.getWarehouse(), dealerNet.getAssemblyLine(), consumer);
                cashier.takeOrder(celled);
                report.addSoldCar(celled);
            } catch (NullPointerException e) {
                //покупатель уходит ни с чем
            }
        }
        System.out.printf("%6.2f\n", Cashier.getProfit());
        try {
            manager.generateStatistics(report);
        } catch (FileNotFoundException e) {
            System.out.println("файл не был найден");
        }
    }
}
