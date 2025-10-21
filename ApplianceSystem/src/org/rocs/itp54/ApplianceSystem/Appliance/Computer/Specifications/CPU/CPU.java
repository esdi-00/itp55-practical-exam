package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.CPU;

//CPU Class for Computer
public class CPU {
    //Fields for CPU Class
    private String model;
    private double speed;
    private int cores;

    //Constructor
    public CPU(String model, double speed, int cores) {
        this.model = model;
        this.speed = speed;
        this.cores = cores;
    }

    //Getters and setters
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

    //toString method for output
   @Override
    public String toString() {
        return model + " (" + cores + " cores, " + speed + "GHz)";
    }
}
