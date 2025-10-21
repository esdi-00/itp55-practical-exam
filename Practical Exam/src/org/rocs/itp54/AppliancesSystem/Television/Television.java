package org.rocs.itp54.AppliancesSystem.Television;

import org.rocs.itp54.AppliancesSystem.Appliance.Appliance;
import org.rocs.itp54.AppliancesSystem.Channel.Channel;
import org.rocs.itp54.AppliancesSystem.Channel.Quality;

public class Television extends Appliance {
    private int maxChannelNumber;
    Channel channel;

    public int getMaxChannelNumber() {
        return maxChannelNumber;
    }

    public Channel getChannel() {
        return channel;
    }

    public Television(String brandName, int wattage, int warranty, Quality quality, int maxChannelNumber, Channel channel) {
        super(brandName, wattage, warranty, quality);
        this.maxChannelNumber = maxChannelNumber;
        this.channel = channel;
    }
}
