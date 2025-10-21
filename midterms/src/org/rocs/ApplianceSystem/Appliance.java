package org.rocs.ApplianceSystem;

public class Appliance {

    private String brandName;
    private int wattage;
    private String warrantyproperties;

    public Appliance(String brandName, int wattage, String warrantyproperties) {
        this.brandName = brandName;
        this.wattage = wattage;
        this.warrantyproperties = warrantyproperties;
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public String getWarrantyproperties() {
        return warrantyproperties;
    }

    public void setWarrantyproperties(String warrantyproperties) {
        this.warrantyproperties = warrantyproperties;
    }
}