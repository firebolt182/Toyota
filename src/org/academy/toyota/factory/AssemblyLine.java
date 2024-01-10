package org.academy.toyota.factory;

import org.academy.toyota.abstractcar.option.CruiseControl;
import org.academy.toyota.abstractcar.option.Top;
import org.academy.toyota.car.camry.Camry;
import org.academy.toyota.car.camry.UsbPort;
import org.academy.toyota.car.details.*;
import org.academy.toyota.car.dyna.Dyna;
import org.academy.toyota.car.dyna.Socket;
import org.academy.toyota.car.hiance.Hiance;
import org.academy.toyota.car.solara.Refrigerator;
import org.academy.toyota.car.solara.Solara;

public class AssemblyLine {
    private Country country;
    private Factory factory;

    public AssemblyLine(Country country) {
        this.country = country;
        factory = new Factory(country);
    }

    // проблема с пятым колесом
    public Camry createCamry(double price, String color) {
        check();
        Electric electric = factory.buildElectric();
        Engine engine = factory.buildEngine();
        Light light = factory.buildLight();
        Tank tank = factory.buildTank();
        Wheel[] wheels = factory.buildWheels(17);
        CruiseControl cruiseControl = new CruiseControl();
        UsbPort usbPort = new UsbPort();
        return new Camry(color, 200, Transmission.AUTOMATIC, false,
                wheels, tank, engine, electric, light, price, this.country, cruiseControl, usbPort);
    }

    public Dyna createDyna(double price, String color) {
        check();
        Electric electric = factory.buildElectric();
        Engine engine = factory.buildEngine();
        Light light = factory.buildLight();
        Tank tank = factory.buildTank();
        Wheel[] wheels = factory.buildWheels(20);
        return new Dyna(color, 170, Transmission.MANUAL, false,
                wheels, tank, engine, electric, light, price, this.country, 3000, new Socket());
    }

    public Hiance createHiance(double price, String color) {
        check();
        Electric electric = factory.buildElectric();
        Engine engine = factory.buildEngine();
        Light light = factory.buildLight();
        Tank tank = factory.buildTank();
        Wheel[] wheels = factory.buildWheels(20);
        Wheel additionalWheel = new Wheel(false, 20);
        return new Hiance(color, 190, Transmission.ROBOT, false, wheels, tank,
                engine, electric, light, price, this.country, 2000, additionalWheel);
    }

    public Solara createSolara(double price, String color) {
        check();
        Electric electric = factory.buildElectric();
        Engine engine = factory.buildEngine();
        Light light = factory.buildLight();
        Tank tank = factory.buildTank();
        Wheel[] wheels = factory.buildWheels(20);
        return new Solara(color, 230, Transmission.AUTOMATIC, false, wheels,
                tank, engine, electric, light, price, this.country, new Top(), new Refrigerator());
    }

    private void check() {
        try {
            checkCountry();
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
    }

    private void checkCountry() throws CountryFactoryNotEqualException {
        if (!(this.country.equals(factory.getCountry()))) {
            throw new CountryFactoryNotEqualException("Страна сборочного цеха : "
                    + this.country + " не совпадает со страной - заводом : "
                    + factory.getCountry());
        }
    }
}
