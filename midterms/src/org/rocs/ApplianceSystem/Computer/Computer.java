package org.rocs.ApplianceSystem.Computer;

import org.rocs.ApplianceSystem.Appliance;

public class Computer extends Appliance{

    public Computer(String brandName, int wattage, String warrantyproperties) {
        super(brandName, wattage, warrantyproperties);
    }

    private String CPU;
    private String RAM;
    private enum Storage{
        SSD,
        HDD
    }


}




