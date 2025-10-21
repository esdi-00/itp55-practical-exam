package org.rocs.quevadapeit54.Appliance;

public class abstract Appliance {

    private String brandName;
    private double wattage;
    private String warranty;
    public Appliance(String brandName, double wattage, String warranty) {
        this.brandName = brandName;
        this.wattage = wattage;
        this.warranty = warranty;
    }

}
