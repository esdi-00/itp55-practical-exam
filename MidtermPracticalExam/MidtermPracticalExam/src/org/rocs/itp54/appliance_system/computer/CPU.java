package org.rocs.itp54.appliance_system.computer;

public class CPU {
    private String model;
    private double frequencyGHz;

    public CPU() {}

    public CPU(String model, double frequencyGHz) {
        this.model = model;
        this.frequencyGHz = frequencyGHz;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFrequencyGHz() {
        return frequencyGHz;
    }

    public void setFrequencyGHz(double frequencyGHz) {
        this.frequencyGHz = frequencyGHz;
    }

    @Override
    public String toString() {
        return "Cpu{" + "model='" + model + '\'' + ", freq=" + frequencyGHz + "GHz}";
    }
}
