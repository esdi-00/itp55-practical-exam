package org.rocs.itp54.ApplianceSystem;

import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.CPU.CPU;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.OperatingSystem.OperatingSystem;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.Storage.Storage;
import org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel.Quality.Quality;
import org.rocs.itp54.ApplianceSystem.Exception.InvalidQualityException;

import java.util.Scanner;

public class ApplianceApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Please Enter ChannelName: ");
            String ChannelName = scanner.nextLine();
            System.out.print("Please Enter ChannelNumber: ");
            double ChannelNumber = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Please Enter Quality: ");
            String quality = scanner.nextLine();
            checkQuality(quality);
        } catch (InvalidQualityException e) {
            System.out.println("Invalid Quality. Try Again");
        }
    }
    private static void checkQuality(String quality) throws InvalidQualityException {
        for (Quality i: Quality.values()) {
            if (i.name().equalsIgnoreCase(quality)){
                return;
            }
        }
        throw new InvalidQualityException("Invalid Quality: " + quality);
    }

}
