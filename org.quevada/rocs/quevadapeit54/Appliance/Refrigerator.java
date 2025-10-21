package org.rocs.quevadapeit54.Appliance;

public class Refrigerator extends Appliance{

    private int temperature;

    public Refrigerator(String brandName, double wattage, String warranty) {
        super(brandName, wattage, warranty);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
