package org.rocs.itp54.appliance_system.refrigerator;

import org.rocs.itp54.appliance_system.appliance.Appliance;

public class Refrigerator extends Appliance {
    private double temperature; //Celsius

    public Refrigerator(String id, String brandName, int wattage, int warranty, double temperature) {
        super(id, brandName, wattage, warranty);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getDetails() {
        return toString() + ", temperature=" + temperature;
    }

    @Override
    public void operateForHours(double hours) {
        System.out.println("Refrigerator " + id + " cooling for " + hours + " hours at " + temperature + "°C.");
    }
}