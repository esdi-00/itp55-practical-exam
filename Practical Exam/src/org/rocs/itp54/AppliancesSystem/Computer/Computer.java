package org.rocs.itp54.AppliancesSystem.Computer;

import org.rocs.itp54.AppliancesSystem.Appliance.Appliance;
import org.rocs.itp54.AppliancesSystem.Channel.Quality;
import org.rocs.itp54.AppliancesSystem.Computer.CPU.CPU;
import org.rocs.itp54.AppliancesSystem.Computer.OperatingSystem.OperatingSystem;
import org.rocs.itp54.AppliancesSystem.Computer.RAM.RAM;
import org.rocs.itp54.AppliancesSystem.Computer.Storage.Storage;

public class Computer extends Appliance {

    CPU cpu;
    Storage storage;
    OperatingSystem os;
    RAM ram;

    public CPU getCpu() {
        return cpu;
    }

    public Storage getStorage() {
        return storage;
    }

    public OperatingSystem getOs() {
        return os;
    }

    public RAM getRam() {
        return ram;
    }

    public Computer(String brandName, int wattage, int warranty, Quality quality, CPU cpu, Storage storage, OperatingSystem os, RAM ram) {
        super(brandName, wattage, warranty, quality);
        this.cpu = cpu;
        this.storage = storage;
        this.os = os;
        this.ram = ram;
    }
}
