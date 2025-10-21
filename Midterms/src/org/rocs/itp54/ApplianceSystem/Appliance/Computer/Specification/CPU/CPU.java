package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.CPU;

public class CPU {

    private String brand;
    private String model;
    private double speedGHz;

    public CPU(String brand, double speedGHz) {
        this.brand = brand;
        this.model = model;
        this.speedGHz = speedGHz;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getSpeedGHz() {
        return speedGHz;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + speedGHz + " GHz)";
    }
}

