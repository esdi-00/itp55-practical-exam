package org.rocs.itp54.ApplianceSystem.Appliance.Television;

import org.rocs.itp54.ApplianceSystem.Appliance.Appliance;
import org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel.Channel;

//Television class which extends Appliance
public class Television extends Appliance {

    //Additional Television Fields
    private int maxChannelNumber;
    private Channel channel;

    //Constructor
    public Television(String brandName, double wattage, String warranty, int maxChannelNumber, Channel channel) {
        super(brandName, wattage, warranty);
        this.maxChannelNumber = maxChannelNumber;
        this.channel = channel;
    }

    //Getters and Setters
    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public int getMaxChannelNumber() {
        return maxChannelNumber;
    }

    public void setMaxChannelNumber(int maxChannelNumber) {
        this.maxChannelNumber = maxChannelNumber;
    }

    //toString method for output
    @Override
    public String toString() {
        //Ternary operator checking if channel exists (hehe maipilit lang sana may points)
        return super.toString() + "\nMax Channels: " + maxChannelNumber + (channel != null ? "\nCurrent " + channel : "");
    }

}
