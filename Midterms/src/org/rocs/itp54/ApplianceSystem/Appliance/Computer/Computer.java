package org.rocs.itp54.ApplianceSystem.Appliance.Computer;

import org.rocs.itp54.ApplianceSystem.Appliance.Appliance;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.CPU.CPU;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.OperatingSystem.operatingSystem;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.RAM.RAM;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.Storage.Storage;

public class Computer extends Appliance {
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private operatingSystem operatingSystem;


    public Computer(String brandName, double wattage, String warranty,
                    CPU cpu, RAM ram, Storage storage, operatingSystem operatingSystem) {
        super(brandName, wattage, warranty);
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
    }


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

    public operatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(operatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    public void display() {
        System.out.println("Computer Details:");
        System.out.println("Brand: " + getBrandName());
        System.out.println("Wattage: " + getWattage() + "W");
        System.out.println("Warranty: " + getWarranty());
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Operating System: " + operatingSystem);
    }

    @Override
    public void displayInfo() {

    }

    @Override
    public void turnOn(double hours) {

    }
}
