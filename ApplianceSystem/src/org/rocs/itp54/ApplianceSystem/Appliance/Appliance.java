package org.rocs.itp54.ApplianceSystem.Appliance;

public class Appliance {

    public Appliance(String brandName, double wattage, String warranty) {
        this.brandName = brandName;
        this.wattage = wattage;
        this.warranty = warranty;
    }
    private String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    private double wattage;
    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    private  String warranty;

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
}
