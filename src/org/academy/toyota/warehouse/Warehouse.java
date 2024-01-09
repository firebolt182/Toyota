package org.academy.toyota.warehouse;

import org.academy.toyota.abstractcar.Car;
import org.academy.toyota.car.camry.Camry;
import org.academy.toyota.car.dyna.Dyna;
import org.academy.toyota.car.hiance.Hiance;
import org.academy.toyota.car.solara.Solara;

public class Warehouse {
    private int carCount = 0;
    private int camryCount = 0;
    private int dynaCount = 0;
    private int hianceCount = 0;
    private int solaraCount = 0;

    private Car[] cars = new Car[1000];

    //Добавляем машины на склад
    public void addCamry(Camry camry) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = camry;
                carCount++;
                camryCount++;
                break;
            }
        }
    }

    public void addDyna(Dyna dyna) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = dyna;
                carCount++;
                dynaCount++;
                break;
            }
        }
    }

    public void addHiance(Hiance hiance) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = hiance;
                carCount++;
                hianceCount++;
                break;
            }
        }
    }

    public void addSolara(Solara solara) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = solara;
                carCount++;
                solaraCount++;
                break;
            }
        }
    }

    public void addCar(Car car) {
        switch (car.getClass().getSimpleName()) {
            case "Camry":
                addCamry((Camry) car);
                break;
            case "Dyna":
                addDyna((Dyna) car);
                break;
            case "Hiance":
                addHiance((Hiance) car);
                break;
            case "Solara":
                addSolara((Solara) car);
                break;
        }
    }

    //Берем машины со склада
    public Camry takeCamry() throws NullPointerException {
        Camry camry = null;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getClass().equals(Camry.class)) {
                camry = (Camry) cars[i];
                cars[i] = null;
                camryCount--;
                carCount--;
                break;
            }
        }
        return camry;
    }

    public Dyna takeDyna() throws NullPointerException {
        Dyna dyna = null;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getClass().equals(Dyna.class)) {
                dyna = (Dyna) cars[i];
                cars[i] = null;
                dynaCount--;
                carCount--;
                break;
            }
        }
        return dyna;
    }

    public Hiance takeHiance() throws NullPointerException {
        Hiance hiance = null;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getClass().equals(Hiance.class)) {
                hiance = (Hiance) cars[i];
                cars[i] = null;
                hianceCount--;
                carCount--;
                break;
            }
        }
        return hiance;
    }

    public Solara takeSolara() throws NullPointerException {
        Solara solara = null;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getClass().equals(Solara.class)) {
                solara = (Solara) cars[i];
                cars[i] = null;
                solaraCount--;
                carCount--;
                break;
            }
        }
        return solara;
    }


    public Car takeCar(Car car) throws NullPointerException {
        switch (car.getClass().getSimpleName()) {
            case "Camry":
                return takeCamry();
            case "Dyna":
                return takeDyna();
            case "Hiance":
                return takeHiance();
            case "Solara":
                return takeSolara();
        }
        return null;
    }

    //Методы,которые показывают количество машин по каждой модели
    public int showCamryAmount() {
        return camryCount;
    }

    public int showDynaAmount() {
        return dynaCount;
    }

    public int showHianceAmount() {
        return hianceCount;
    }

    public int showSolaraAmount() {
        return solaraCount;
    }

    public int getCarCount() {
        return carCount;
    }

    public Car[] getCars() {
        return cars;
    }
}