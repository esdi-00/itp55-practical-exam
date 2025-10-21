package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.RAM;

public class RAM {
    private int sizeGB;
    private String type;

    public RAM(int sizeGB) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return sizeGB + "GB " + type;
    }
}
