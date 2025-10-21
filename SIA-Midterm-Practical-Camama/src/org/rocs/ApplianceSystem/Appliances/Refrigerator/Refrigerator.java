package org.rocs.ApplianceSystem.Appliances.Refrigerator;

import org.rocs.ApplianceSystem.Appliance;

public class Refrigerator extends Appliance {
    private int temperature;

    public Refrigerator(String brandName, int wattage, boolean warranty) {
        super(brandName, wattage, warranty);
    }

    public Refrigerator(String brandName, int wattage, boolean warranty, int temperature) {
        super(brandName, wattage, warranty);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
