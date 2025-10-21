package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.CPU;

public class CPU {
    private String model;
    private double speed;
    private int cores;

    public CPU(String model, double speed, int cores) {
        this.model = model;
        this.speed = speed;
        this.cores = cores;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
