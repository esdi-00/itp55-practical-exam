package org.rocs.itp54.appliance_system.computer;

public class Storage {
    public enum Type { SSD, HDD } //Enumeration

    private Type type;
    private int capacityGB;

    public Storage() {}

    public Storage(Type type, int capacityGB) {
        this.type = type;
        this.capacityGB = capacityGB;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    public void setCapacityGB(int capacityGB) {
        this.capacityGB = capacityGB;
    }

    @Override
    public String toString() {
        return "Storage{" + type + ", " + capacityGB + "GB}";
    }
}
