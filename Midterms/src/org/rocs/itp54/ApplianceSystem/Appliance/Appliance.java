package org.rocs.itp54.ApplianceSystem.Appliance;

public abstract class Appliance {
    private String brandName;
    private double wattage;
    private String warranty;

    public Appliance(String brandName, double wattage, String warranty) {
        this.brandName = brandName;
        this.wattage = wattage;
        this.warranty = warranty;
    }

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

    public abstract void displayInfo();

    public abstract void turnOn(double hours);
}
