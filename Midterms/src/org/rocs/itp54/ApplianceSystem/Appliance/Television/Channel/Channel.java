package org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel;

import org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel.Quality.Quality;

public class Channel {
    private int channelNumber;
    private String channelName;
    private String quality;

    // Constructor
    public Channel(int channelNumber, String channelName, String quality) throws InvalidQualityException {
        this.channelNumber = channelNumber;
        this.channelName = channelName;
        setQuality(quality); // validate quality when setting
    }

    // Getters and Setters
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

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) throws InvalidQualityException {
        if (!quality.equalsIgnoreCase("Standard Definition") &&
                !quality.equalsIgnoreCase("High Definition") &&
                !quality.equalsIgnoreCase("Full HD") &&
                !quality.equalsIgnoreCase("Ultra HD")) {
            throw new InvalidQualityException("Invalid quality: " + quality);
        }
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Channel " + channelNumber + ": " + channelName + " (" + quality + ")";
    }
}
