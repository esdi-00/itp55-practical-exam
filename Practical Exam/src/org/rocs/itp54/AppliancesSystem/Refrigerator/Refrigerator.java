package org.rocs.itp54.AppliancesSystem.Refrigerator;

import org.rocs.itp54.AppliancesSystem.Appliance.Appliance;
import org.rocs.itp54.AppliancesSystem.Channel.Quality;

public class Refrigerator extends Appliance {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public Refrigerator(String brandName, int wattage, int warranty, Quality quality, double temperature) {
        super(brandName, wattage, warranty, quality);
        this.temperature = temperature;
    }
}
