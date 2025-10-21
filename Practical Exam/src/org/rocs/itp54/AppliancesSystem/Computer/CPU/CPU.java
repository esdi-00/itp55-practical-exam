package org.rocs.itp54.AppliancesSystem.Computer.CPU;

public class CPU {

    private String model;
    private String brand;

    public CPU(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
