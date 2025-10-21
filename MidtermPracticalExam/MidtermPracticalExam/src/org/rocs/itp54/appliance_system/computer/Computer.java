package org.rocs.itp54.appliance_system.computer;

import org.rocs.itp54.appliance_system.appliance.Appliance;
import org.rocs.itp54.appliance_system.operatingsystem.OperatingSystem;

import java.util.Objects;

public class Computer extends Appliance {
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private OperatingSystem os;

    public Computer(String id, String brandName, int wattage, int warranty, CPU cpu, RAM ram, Storage storage, OperatingSystem os) {
        super(id, brandName, wattage, warranty);
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
    }

    //Constructor Overloading
    public Computer(String id, String brandName) {
        super(id, brandName);
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

    public OperatingSystem getOs() {
        return os;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    @Override
    public String getDetails() {
        return toString() + ", cpu=" + (cpu != null ? cpu.toString() : "none")
                + ", ram=" + (ram != null ? ram.toString() : "none")
                + ", storage=" + (storage != null ? storage.toString() : "none")
                + ", os=" + (os != null ? os.name() : "none");
    }

    //Overriding
    @Override
    public void operateForHours(double hours) {
        System.out.println("Computer " + id + " performing tasks for " + hours + " hours.");
    }

    @Override
    public boolean equals(Object o) { // Overriding Object class equals (Overriding Object Class)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(id, computer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}