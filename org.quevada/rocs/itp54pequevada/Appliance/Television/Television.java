package org.rocs.itp54pequevada.Appliance.Television;

import org.rocs.itp54pequevada.Appliance.Appliance;
import org.rocs.itp54pequevada.Appliance.Operatable;

public class Television extends Appliance implements Operatable {

    private String channel;
    private int maxChannelNumber;
    //constructor of television
    public Television(String brandName, double wattage, String warranty, String channel, int maxChannelNumber) {
        super(brandName, wattage, warranty);
        this.channel = channel;
        this.maxChannelNumber = maxChannelNumber;
    }
    public Television(){

    }
    //method to display information about television
    public void displayTelevisionInfo(){
        setBrandName("Samsung");
        setWarranty("Until January 10, 2030");
        System.out.println("Brand: " + getBrandName());
        System.out.println("Warranty: " + getWarranty());
        System.out.println("Quality: " + getWarranty());
        System.out.println("Channel: " + getChannel());
        System.out.println("Max Channel Number: " + maxChannelNumber);
    }
    //getters and setters
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getMaxChannelNumber() {
        return maxChannelNumber;
    }

    public void setMaxChannelNumber(int maxChannelNumber) {
        this.maxChannelNumber = maxChannelNumber;
    }
    //to compute the total cost of electricity
    @Override
    public double  operate(double hours) {
        return (getWattage()*20) * hours;
    }

}
