package org.rocs.itp54.ApplianceSystem.Appliance.Computer;

import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.CPU.CPU;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.OperatingSystem.OperatingSystem;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.RAM.RAM;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.Storage.Storage;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private OperatingSystem operatingSystem;

    public Computer(CPU cpu, RAM ram, Storage storage, OperatingSystem operatingSystem) {
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

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
