package org.rocs.ApplianceSystem;

public class Appliance {
    private String brandName;
    private int wattage;
    private boolean warranty;

    public Appliance(String brandName, int wattage, boolean warranty) {
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

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }
}
