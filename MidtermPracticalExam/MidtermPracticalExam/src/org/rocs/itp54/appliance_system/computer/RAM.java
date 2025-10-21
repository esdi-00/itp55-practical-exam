package org.rocs.itp54.appliance_system.computer;

public class RAM {
    private int sizeGB;

    public RAM() {}

    public RAM(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    @Override
    public String toString() {
        return "RAM{" + sizeGB + "GB}";
    }
}

