package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.RAM;

public class RAM {
    private int memory;
    private double speed;

    public RAM(int memory, double speed) {
        this.memory = memory;
        this.speed = speed;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
