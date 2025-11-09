package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.RAM;

public class RAM {
    //RAM class fields
    private int size;
    private int speed;
    private String brand;

    //RAM getter and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //RAM Constructor
    public RAM(int size, int speed, String brand) {
        this.size = size;
        this.speed = speed;
        this.brand = brand;
    }
    //Display output
    @Override
    public String toString() {
        return size + " " + speed + " " + brand + " ";
    }
}
