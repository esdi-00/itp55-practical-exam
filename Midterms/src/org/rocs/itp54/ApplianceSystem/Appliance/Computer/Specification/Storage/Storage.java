package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.Storage;

public class Storage {
    private int capacityGB;
    private String type;

    public Storage(int capacityGB, String type) {
        this.capacityGB = capacityGB;
        this.type = type;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return capacityGB + "GB " + type;
    }
}
