package org.rocs.itp54.ApplianceSystem.Appliance.Television;

import org.rocs.itp54.ApplianceSystem.Appliance.Appliance;
import org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel.Channel;

public class Television extends Appliance {
    private Channel channel;
    private int maxChannelNumber;

    public Television(String brandName, double wattage, String warranty, Channel channel, int maxChannelNumber) {
        super(brandName, wattage, warranty);
        this.channel = channel;
        this.maxChannelNumber = maxChannelNumber;
    }

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

    @Override
    public void displayInfo() {

    }

    @Override
    public void turnOn(double hours) {

    }
}