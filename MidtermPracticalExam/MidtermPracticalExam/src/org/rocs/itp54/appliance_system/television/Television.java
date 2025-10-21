package org.rocs.itp54.appliance_system.television;

import org.rocs.itp54.appliance_system.appliance.Appliance;
import org.rocs.itp54.appliance_system.channel.Channel;

public class Television extends Appliance {
    private Channel currentChannel; //Instance Members
    private int maxChannelNumber;

    public Television(String id, String brandName, int wattage, int warranty, int maxChannelNumber) {
        super(id, brandName, wattage, warranty); // super Keyword
        this.maxChannelNumber = maxChannelNumber;
    }

    public void setCurrentChannel(Channel channel) {
        this.currentChannel = channel;
    }

    public Channel getCurrentChannel() {
        return currentChannel;
    }

    public int getMaxChannelNumber() {
        return maxChannelNumber;
    }

    @Override
    public String getDetails() {
        return toString() + ", currentChannel=" + (currentChannel != null ? currentChannel.toString() : "none");
    }

    //Method Overriding
    @Override
    public void operateForHours(double hours) {
        System.out.println("Television " + id + " on for " + hours + " hours. Channel: " +
                (currentChannel != null ? currentChannel.toString() : "none"));
    }
}