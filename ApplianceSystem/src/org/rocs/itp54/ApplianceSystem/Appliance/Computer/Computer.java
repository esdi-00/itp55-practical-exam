package org.rocs.itp54.ApplianceSystem.Appliance.Computer;

import org.rocs.itp54.ApplianceSystem.Appliance.Appliance;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.CPU.CPU;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.OperatingSystem.OperatingSystem;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.RAM.RAM;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.Storage.Storage;

//Computer class which extends Appliance
public class Computer extends Appliance {
    //Additional Computer Fields
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private OperatingSystem operatingSystem;

    //Constructor
    public Computer(String brandName, double wattage, String warranty, CPU cpu, RAM ram, Storage storage, OperatingSystem operatingSystem) {
        super(brandName, wattage, warranty);
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
    }

    //Getters and setters
    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    //toString method for output
    @Override
    public String toString() {
        return super.toString() + "\nCPU: " + cpu + "\nRAM: " + ram + "\nStorage: " + storage + "\nOS: " + operatingSystem;
    }
}
