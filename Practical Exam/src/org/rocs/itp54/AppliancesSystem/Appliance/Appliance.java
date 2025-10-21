package org.rocs.itp54.AppliancesSystem.Appliance;

public class Appliance {
    private String brandName;
    private int wattage;
    private int warranty;


    public Appliance(String brandName, int wattage, int warranty) {
        this.brandName = brandName;
        this.wattage = wattage;
        this.warranty = warranty;
    }


    public String getBrandName() {
        return brandName;
    }

    public int getWattage() {
        return wattage;
    }

    public int getWarranty() {
        return warranty;
    }
}
