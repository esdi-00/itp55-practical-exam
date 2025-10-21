package org.rocs.itp54.ApplianceSystem.Appliance.Refrigerator;

import org.rocs.itp54.ApplianceSystem.Appliance.Appliance;


import java.io.FileWriter;
import java.io.IOException;

public class Refrigerator extends Appliance {
    private double temperature; // temperature in °C

    public Refrigerator(String brandName, double wattage, String warranty, double temperature) {
        super(brandName, wattage, warranty);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void displayInfo() {
        System.out.println("Refrigerator");
        System.out.println("Brand: " + getBrandName());
        System.out.println("Wattage: " + getWattage() + "W");
        System.out.println("Warranty: " + getWarranty());
        System.out.println("Temperature: " + temperature + "°C");
    }

    @Override
    public void turnOn(double hours) {

    }

}


