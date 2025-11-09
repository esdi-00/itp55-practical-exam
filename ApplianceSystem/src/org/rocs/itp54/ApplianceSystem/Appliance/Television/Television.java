package org.rocs.itp54.ApplianceSystem.Appliance.Television;

import org.rocs.itp54.ApplianceSystem.Appliance.Appliance;

public class Television extends Appliance {
    private int Channel;
    public int getChannel() {
        return Channel;
    }

    public void setChannel(int channel) {
        Channel = channel;
    }

    private int maxChannelNumber;
    public int getMaxChannelNumber() {
        return maxChannelNumber;
    }

    public void setMaxChannelNumber(int maxChannelNumber) {
        this.maxChannelNumber = maxChannelNumber;
    }

            public Television(String brandName, double wattage, String warranty, int Channel,int maxChannelNumber ) {
                super(brandName, wattage, warranty);
                this.Channel = Channel;
                this.maxChannelNumber = maxChannelNumber;
    }
}
