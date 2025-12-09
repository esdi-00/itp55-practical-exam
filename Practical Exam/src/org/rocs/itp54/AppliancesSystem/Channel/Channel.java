package org.rocs.itp54.AppliancesSystem.Channel;

import java.util.Scanner;

public class Channel {


    private int channelNumber;
    private String channelName;

    public int getChannelNumber() {
        return channelNumber;
    }

    public String getChannelName() {
        return channelName;
    }

    public Channel(int channelNumber, String channelName) {
        this.channelNumber = channelNumber;
        this.channelName = channelName;
    }
}
