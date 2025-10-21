package org.rocs.itp54.appliance_system.appliance;

import org.rocs.itp54.appliance_system.operatable.Operatable;

public abstract class Appliance implements Operatable {
    //Instance members
    private String brandName; //Access Modifiers
    private int wattage;//Encapsulation
    private int warranty;

    protected static int applianceCount = 0;//static member
    public final String id;//final member

    //Constructor
    public Appliance(String id, String brandName, int wattage, int warranty) {
        this.id = id; //this Keyword
        this.brandName = brandName;
        this.wattage = wattage;
        this.warranty = warranty;
        applianceCount++; //static usage
    }
    public Appliance(String id, String brandName) { //Constructor Overloading
        this(id, brandName, 0, 0);

    }
    public String getBrandName() {//Access Modifiers
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

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public abstract String getDetails();//Abstract Method

    public double computeKilowatts() {//Instance method
        return wattage / 1000.0;
    }

    @Override
    public void operateForHours(double hours) {
        // default simple implementation
        System.out.println(getClass().getSimpleName() + " " + id + " operated for " + hours + " hours.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "id='" + id + '\'' +
                ", brandName='" + brandName + '\'' +
                ", wattage=" + wattage +
                ", warranty=" + warranty +
                '}';
    }
}