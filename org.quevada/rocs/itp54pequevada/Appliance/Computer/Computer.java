package org.rocs.itp54pequevada.Appliance.Computer;

import org.rocs.itp54pequevada.Appliance.Appliance;
import org.rocs.itp54pequevada.Appliance.Operatable;

public class Computer extends Appliance implements Operatable {

    CPU cpu = new CPU();
    RAM ram  = new RAM();
    Storage  storage = new Storage();
    private String operatingSystem = "Windows 11";


    public Computer(String brandName, double wattage, String warranty, String operatingSystem) {
        super(brandName, wattage, warranty);

        this.operatingSystem = operatingSystem;
    }

    public Computer() {

    }

    public void displaySpecs(){
        System.out.println("Computer Specification");
        setBrandName("Acer");
        setWarranty("Until December 10, 2030");
        System.out.println("Brand: " + getBrandName());
        System.out.println("Warranty: " + getWarranty());
        System.out.println(" " + cpu.CPU());
        System.out.println(" " + ram.RAM());
        System.out.println(" " + storage.Storage());
        System.out.println("Operating System: " + operatingSystem);
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

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    @Override
    public double  operate(double hours) {
        return getWattage() * hours;
    }
}
