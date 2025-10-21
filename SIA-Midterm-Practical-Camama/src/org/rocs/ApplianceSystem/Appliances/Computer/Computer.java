package org.rocs.ApplianceSystem.Appliances.Computer;

import org.rocs.ApplianceSystem.Appliance;

public class Computer extends Appliance {
    private String cpu;
    private String storage;
    private int ram;

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Computer(String brandName, int wattage, boolean warranty, String cpu, String storage, int ram, String operatingSystem) {
        super(brandName, wattage, warranty);
        this.cpu = cpu;
        this.storage = storage;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    private String operatingSystem;


    public Computer(String brandName, int wattage, boolean warranty) {
        super(brandName, wattage, warranty);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getStorage() {
        return storage;
    }
}
