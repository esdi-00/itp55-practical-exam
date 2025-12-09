package org.rocs.itp54.AppliancesSystem.Appliance;

import org.rocs.itp54.AppliancesSystem.Channel.Quality;

public class Appliance {
    private String brandName;
    private int wattage;
    private int warranty;
    Quality quality;

    public Appliance(String brandName, int wattage, int warranty, Quality quality) {
        this.brandName = brandName;
        this.wattage = wattage;
        this.warranty = warranty;
        this.quality = quality;
    }

    public Quality getQuality() {
        return quality;
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
