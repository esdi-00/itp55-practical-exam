package org.rocs.itp54pequevada.Appliance.Refrigerator;

import org.rocs.itp54pequevada.Appliance.Appliance;
import org.rocs.itp54pequevada.Appliance.Operatable;

public class Refrigerator extends Appliance implements Operatable {

    private double temperature;
    //constructor
    public Refrigerator(String brandName, double wattage, String warranty, double temperature) {
        super(brandName, wattage, warranty);
        this.temperature = temperature;
    }
    public Refrigerator() {

    }
    //to display information of refrigerator
    public void displayRefrigeratorInfo(){
        System.out.println("Refrigerator Information");
        setBrandName("Samsung");
        setWarranty("Until September 10, 2030");
        System.out.println("Brand: " + getBrandName());
        System.out.println("Warranty: " + getWarranty());
        System.out.println("Temperature: " + temperature);
    }
    //getters and setters
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    //computation for total cost of electricity
    @Override
    public double  operate(double hours) {
        return (getWattage()+10) * hours;
    }
}
