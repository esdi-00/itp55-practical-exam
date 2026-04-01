package org.rocs.itp54pequevada.Appliance.Television;
import org.rocs.itp54pequevada.Appliance.Television.Quality;

public class Channel {

    private int channelNumber;
    private String channelName;
    private Quality quality;
    //constructor
    public Channel(int channelNumber, String channelName, Quality quality) {
        this.channelNumber = channelNumber;
        this.channelName = channelName;
        this.quality = quality;
    }
    public Channel() {

    }

    public void displayChannelInfo(){
        //To print all the values of enum Quality
        System.out.println("Available Qualities ");
        for (Quality q : Quality.values()) {
            System.out.println(" " + q);
        }
    }
    //getters and setters
    public void numberOfChannels(int maxChannel){

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
