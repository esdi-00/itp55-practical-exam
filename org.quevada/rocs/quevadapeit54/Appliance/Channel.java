package org.rocs.quevadapeit54.Appliance;
public class Channel {

    private int channelNumber;
    private String channelName;
    Quality quality;

    public Channel(int channelNumber, String channelName, Quality quality) {
        this.channelNumber = channelNumber;
        this.channelName = channelName;
        this.quality = quality;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }
}
