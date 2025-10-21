package org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel;

import org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel.Quality.Quality;

public class Channel {

    private int channelNumber;
    private String channelName;
    private Quality quality;

    public Channel(int channelNumber, String channelName) {
        this.channelNumber = channelNumber;
        this.channelName = channelName;
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
