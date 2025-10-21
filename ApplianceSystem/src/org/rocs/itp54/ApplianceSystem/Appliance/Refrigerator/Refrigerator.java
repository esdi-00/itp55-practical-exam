package org.rocs.itp54.ApplianceSystem.Appliance.Refrigerator;

import org.rocs.itp54.ApplianceSystem.Appliance.Appliance;

//Refrigerator class which extends Appliance
public class Refrigerator extends Appliance {
    //Additional Refrigerator Field
    private double temperature;

    //Constructor
    public Refrigerator(String brandName, double wattage, String warranty, double temperature) {
        super(brandName, wattage, warranty);
        this.temperature = temperature;
    }

    //Getter and setter
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    //toString method for output
    @Override
    public String toString() {
        return super.toString() + "\nTemperature: " + temperature + "°C";
    }
}
