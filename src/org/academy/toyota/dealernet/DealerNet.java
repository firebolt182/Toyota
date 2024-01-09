package org.academy.toyota.dealernet;

import org.academy.toyota.car.camry.Camry;
import org.academy.toyota.car.dyna.Dyna;
import org.academy.toyota.car.hiance.Hiance;
import org.academy.toyota.car.solara.Solara;
import org.academy.toyota.factory.AssemblyLine;
import org.academy.toyota.factory.Country;
import org.academy.toyota.warehouse.Warehouse;

public class DealerNet {
    private Warehouse warehouse = new Warehouse();

    private AssemblyLine assemblyLine = new AssemblyLine(Country.JAPAN);

    public void createCars() {
        Camry camry = assemblyLine.createCamry(10000, "black");
        Dyna dyna = assemblyLine.createDyna(22000, "black");
        Hiance hiance = assemblyLine.createHiance(15000, "black");
        Solara solara = assemblyLine.createSolara(12000, "white");
        warehouse.addCamry(camry);
        warehouse.addDyna(dyna);
        warehouse.addHiance(hiance);
        warehouse.addSolara(solara);
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public AssemblyLine getAssemblyLine() {
        return assemblyLine;
    }
}
