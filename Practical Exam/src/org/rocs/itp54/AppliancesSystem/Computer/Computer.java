package org.rocs.itp54.AppliancesSystem.Computer;

import org.rocs.itp54.AppliancesSystem.Appliance.Appliance;

public class Computer extends Appliance {

    public Computer(String brandName, int wattage, int warranty, int CPU, int RAM, String storage, String operatingSystem) {
        super(brandName, wattage, warranty);
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
    }

    private int CPU;
    private  int RAM;
    private String storage;
    private String operatingSystem;
}
