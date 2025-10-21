package org.rocs.itp54.appliance_system.channel;

import org.rocs.itp54.appliance_system.exception.InvalidQualityException; // import from Exceptions package
import org.rocs.itp54.appliance_system.quality.Quality;

public class Channel {
    private int channelNumber;
    private String channelName;
    private Quality quality;

    public Channel(int number, String name, String qualityStr) throws InvalidQualityException {
        this.channelNumber = number;
        this.channelName = name;
        setQualityFromString(qualityStr);
    }

    public void setQualityFromString(String q) throws InvalidQualityException {
        if (q == null || q.isEmpty()) {
            throw new InvalidQualityException("Quality cannot be empty.");
        }

        try {
            String normalized = q.trim().toUpperCase().replaceAll("\\s+", "");
            switch (normalized) {
                case "SD":
                case "STANDARD":
                case "STANDARDDEFINITION":
                    this.quality = Quality.SD;
                    break;
                case "HD":
                case "HIGHDEF":
                case "HIGHDEFINITION":
                    this.quality = Quality.HD;
                    break;
                case "FULLHD":
                    this.quality = Quality.FULLHD;
                    break;
                case "ULTRAHD":
                case "ULTRA":
                    this.quality = Quality.ULTRAHD;
                    break;
                default:
                    throw new InvalidQualityException("Invalid quality: " + q);
            }
        } catch (IllegalArgumentException e) {
            throw new InvalidQualityException("Invalid quality: " + q);
        }
    }

    public Quality getQuality() {
        return quality;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public String getChannelName() {
        return channelName;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "channelNumber=" + channelNumber +
                ", channelName='" + channelName + '\'' +
                ", quality=" + quality +
                '}';
    }
}