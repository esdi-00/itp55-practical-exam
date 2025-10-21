package org.rocs.itp54.ApplianceSystem.Appliance.Computer;

import org.rocs.itp54.ApplianceSystem.Appliance.Appliance;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.CPU.CPU;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.OperatingSystem.OperatingSystem;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.RAM.RAM;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.Storage.Storage;

import java.util.SortedMap;

public class Computer extends Appliance {
    //fields of computer subclass
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private OperatingSystem os;

    //getter and setters
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

    public OperatingSystem getOs() {
        return os;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    //Computer constructor
    public Computer(String brandName, double wattage, String warranty, CPU cpu, RAM ram, Storage storage, OperatingSystem os) {
        super(brandName, wattage, warranty);
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.os = os;

        }
    }

