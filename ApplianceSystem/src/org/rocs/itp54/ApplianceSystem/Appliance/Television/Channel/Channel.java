package org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel;

import org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel.Quality.Quality;
import org.rocs.itp54.ApplianceSystem.Exception.InvalidQualityException;

//Channel Class for Television
public class Channel {

    //Channel Fields
    private int channelNumber;
    private String channelName;
    private Quality quality;

    //Constructor
    public Channel(int channelNumber, String channelName, String quality) throws InvalidQualityException {
        this.channelNumber = channelNumber;
        this.channelName = channelName;
        //Calls method in Enum that checks if the string is in the enum and throws exception if not
        this.quality =  Quality.fromString(quality);
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

    @Override
    public String toString() {
        return "Channel " + channelNumber + ": " + channelName + " (" + quality.getDescription() + ")";
    }

}
