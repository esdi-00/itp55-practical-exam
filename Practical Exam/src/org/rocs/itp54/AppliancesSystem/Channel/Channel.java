package org.rocs.itp54.AppliancesSystem.Channel;

import java.util.Scanner;

public class Channel {
    private int channelNumber;
    private String channelName;
    private enum quality {
        Standard_Definition,
        High_Definition,
        Full_HD,
        Ultra_HD
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Channel Name: ");
            String channelName = scanner.nextLine();
            System.out.println("Enter Channel Number: ");
            int channelNum = scanner.nextInt();
            System.out.println("Enter quality: ");
            int quality = scanner.nextInt();
        } catch ()
    }
}
