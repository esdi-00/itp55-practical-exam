package org.rocs.ApplianceSystem.Appliances.Television;

import org.rocs.ApplianceSystem.Appliance;

public class Television extends Appliance {
    private String channel ;
    private int maxChannelNumber;

    public Television(String brandName, int wattage, boolean warranty, String channel, int maxChannelNumber) {
        super(brandName, wattage, warranty);
        this.channel = channel;
        this.maxChannelNumber = maxChannelNumber;
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
