package org.rocs.itp54.ApplianceSystem.Appliance;

import org.rocs.itp54.ApplianceSystem.Interface.Operatable;

//Appliance class which implements Operatable interface

public class Appliance implements Operatable {

    //Appliance Fields
    private String brandName;
    private double wattage;
    private String warranty;

    //Constructor
    public Appliance(String brandName, double wattage, String warranty) {
        this.brandName = brandName;
        this.wattage = wattage;
        this.warranty = warranty;
    }


    //Getters and Setters
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    //Overriding Interface Method
    @Override
    public double turnOn(double hours) {
        double costPerKwh = 35.0;
        double kwh = (wattage / 1000) * hours;
        return kwh * costPerKwh;
    }
    //toString method for output
    @Override
    public String toString() {
        return "Brand: " + brandName + "\nWattage: " + wattage + "W\nWarranty: " + warranty;
    }

}
