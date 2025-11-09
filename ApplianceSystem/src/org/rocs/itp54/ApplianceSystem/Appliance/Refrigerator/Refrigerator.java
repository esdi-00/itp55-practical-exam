package org.rocs.itp54.ApplianceSystem.Appliance.Refrigerator;

import org.rocs.itp54.ApplianceSystem.Appliance.Appliance;

public class Refrigerator extends Appliance {

    private double temperature;

    //getter and setters
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    //constructor
    public Refrigerator(String brandName, double wattage, String warranty, double temperature) {
        super(brandName, wattage, warranty);
        this.temperature = temperature;
    }
    //Display Output
    @Override
    public String toString() {
        return super.toString() + "Temperature: " + temperature + "C";
}}
