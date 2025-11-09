package org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel;

public class Channel {

    public Channel(String channelName, double channelNumber, String quality) {
        this.channelName = channelName;
        this.channelNumber = channelNumber;
        this.quality = quality;
    }

    private String channelName;
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    private double channelNumber;

    public double getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(double channelNumber) {
        this.channelNumber = channelNumber;
    }

    private String quality;

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }




}
