package org.rocs.itp54pequevada.ApplianceApplication;

import org.rocs.itp54pequevada.Appliance.Computer.CPU;
import org.rocs.itp54pequevada.Appliance.Computer.Computer;
import org.rocs.itp54pequevada.Appliance.Computer.RAM;
import org.rocs.itp54pequevada.Appliance.Computer.Storage;
import org.rocs.itp54pequevada.Appliance.Refrigerator.Refrigerator;
import org.rocs.itp54pequevada.Appliance.Television.InvalidQualityException;
import org.rocs.itp54pequevada.Appliance.Television.Channel;
import org.rocs.itp54pequevada.Appliance.Television.Quality;
import org.rocs.itp54pequevada.Appliance.Television.Television;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ApplianceApplication {
    public static void main(String[] args) throws IOException {
        //FileWriter writer = new FileWriter("output.txt");
        Scanner sc = new Scanner(System.in);
        Computer computer = new Computer();
        Refrigerator refrigerator = new Refrigerator();
        Channel channel = new Channel();
        Television television = new Television();
        double hours;

        //user must choose on what appliance to use
        System.out.println("Choose appliance to turn on: Television, Computer, Refrigerator");
        String appliances = sc.next();
        //checks if the user input is television/computer/refrigerator
        if (appliances.equalsIgnoreCase("Television")) {
            try {
                System.out.print("Enter the quality of channel: ");
                String quality = sc.next(); //only accepts _ instead of space
                checkQuality(quality);
            } catch (InvalidQualityException e) {
                System.out.println("The quality of the channel is invalid!");
                System.out.println("Choose on the following qualities.");
                channel.displayChannelInfo();
            } finally {
                /*System.out.print("Enter maximum channel: ");
                int maxChannel = sc.nextInt();
                channel.setChannelNumber(maxChannel);
                for (int i = 1; i <= maxChannel; i++) {
                    System.out.print("Enter name of channel " + i + ": ");
                    String channelName =  sc.next();
                    channel.setChannelName(channelName);
                }*/
                System.out.print("Enter channel number: ");
                String channelNumber = sc.next();
                television.setChannel(channelNumber);
                television.displayTelevisionInfo();
            }
        }
        if (appliances.equalsIgnoreCase("Computer")) {
            System.out.println("Input the total hours of appliance use: ");
            hours = sc.nextDouble();
            double totalConsumedElectricity = computer.operate(hours);
            computer.displaySpecs();
            System.out.println("The total cost of electricity is " + totalConsumedElectricity);
        }
        if (appliances.equalsIgnoreCase("Refrigerator")) {
            System.out.println("Enter temperature of refrigerator: ");
            double temp = sc.nextDouble();
            refrigerator.setTemperature(temp);
            System.out.println("Input the total hours of appliance use: ");
            hours = sc.nextDouble();
            refrigerator.displayRefrigeratorInfo();
            double totalConsumedElectricity = refrigerator.operate(hours);
            System.out.println("The total cost of electricity is " + totalConsumedElectricity);
        }
    }
    //checks the input of quality
    public static void checkQuality(String quality) throws InvalidQualityException {
        System.out.println(" " + quality);
        for (Quality q : Quality.values()) {
            if (q.name().equalsIgnoreCase(quality)) {
                return ;
            }
        }
        throw new InvalidQualityException("Invalid Quality: " + quality);
    }


}
