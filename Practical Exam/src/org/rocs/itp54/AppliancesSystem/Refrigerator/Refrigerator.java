package org.rocs.itp54.AppliancesSystem.Refrigerator;

import org.rocs.itp54.AppliancesSystem.Appliance.Appliance;

public class Refrigerator extends Appliance {

    public Refrigerator(String brandName, int wattage, int warranty, float temperature) {
        super(brandName, wattage, warranty);
        this.temperature = temperature;
    }

    private float temperature;
}
