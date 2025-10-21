package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.CPU;

public class CPU {
    //CPU Constructor
    public CPU(String model, double speed, String core) {
        this.model = model;
        this.speed = speed;
        this.core = core;
    }
    //CPU class fields
    private String model;
    private double speed;
    private String core;

    //CPU getter and setter
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

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }
    //Display Output
    @Override
    public String toString() {
        return model + " " + speed + " " + core + "";

    }
}
