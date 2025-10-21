package org.rocs.itp54.AppliancesSystem.Television;

import org.rocs.itp54.AppliancesSystem.Appliance.Appliance;

public class Television extends Appliance {

    private int channel;
    private int maxChannelNumber;

    public Television(String brandName, int wattage, int warranty, int channel, int maxChannelNumber) {
        super(brandName, wattage, warranty);
        this.channel = channel;
        this.maxChannelNumber = maxChannelNumber;
    }

    public int getChannel() {
        return channel;
    }

    public int getMaxChannelNumber() {
        return maxChannelNumber;
    }
}
