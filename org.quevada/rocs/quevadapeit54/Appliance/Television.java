package org.rocs.quevadapeit54.Appliance;

public class Television extends Appliance{

    private String channel;
    private int maxChannelNumber;
    public Television(String brandName, double wattage, String warranty) {
        super(brandName, wattage, warranty);
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getMaxChannelNumber() {
        return maxChannelNumber;
    }

    public void setMaxChannelNumber(int maxChannelNumber) {
        this.maxChannelNumber = maxChannelNumber;
    }
}
