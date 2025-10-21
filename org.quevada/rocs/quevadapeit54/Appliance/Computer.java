package org.rocs.quevadapeit54.Appliance;

public class Computer extends Appliance{

    private String CPU;
    private String RAM;
    private String storage;
    private String operatingSystem;

    public Computer(String brandName, double wattage, String warranty) {
        super(brandName, wattage, warranty);
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
