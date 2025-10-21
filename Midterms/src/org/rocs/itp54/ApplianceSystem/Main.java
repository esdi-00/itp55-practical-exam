package org.rocs.itp54.ApplianceSystem;

import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Computer;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.CPU.CPU;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.OperatingSystem.operatingSystem;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.RAM.RAM;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.Storage.Storage;
import org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel.Channel;
import org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel.InvalidQualityException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //The Lord be with and Good Day Sir, kindly remove the comments below in order to run the program. Thank you and may the Lord be your blessing.//

        //This class includes the three main part of the Appliance System (Computer, Television, and Refrigerator)//

//        //This is used for Television//
//        System.out.println("TELEVISION: ");
//        String[] channelNames = { "GMA", "NBA", "TV5", "Disney Channel", "National Geographic", "CNN" };
//
//        System.out.println("Choose Channels:");
//        for (int i = 0; i < channelNames.length; i++) {
//            System.out.println((i + 1) + ". Channel " + (i + 1) + " - " + channelNames[i]);
//        }
//
//        System.out.print("Choose a channel number: ");
//        int choice = sc.nextInt();
//        sc.nextLine();
//
//        if (choice < 1 || choice > channelNames.length) {
//            System.out.println(" Invalid channel choice. ");
//            sc.close();
//            return;
//        }
//
//        int channelNumber = choice;
//        String channelName = channelNames[choice - 1];
//
//        System.out.println("Available Qualities:");
//        System.out.println("1. Standard Definition");
//        System.out.println("2. High Definition");
//        System.out.println("3. Full HD");
//        System.out.println("4. Ultra HD");
//        System.out.print("Enter Quality (type the exact name): ");
//        String quality = sc.nextLine();

//        try {
//            // Create Channel
//            Channel selectedChannel = new Channel(channelNumber, channelName, quality);
//            System.out.println("Channel successful");
//            System.out.println(selectedChannel);
//
//        } catch (InvalidQualityException e) {
//            System.out.println(" Error: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println(" Unexpected error: " + e.getMessage());




            //Code for Computer//
//            System.out.println("Computer");
//            System.out.print("Enter brand name: ");
//            String compBrand = sc.nextLine();
//
//            System.out.print("Enter wattage: ");
//            double compWatt = sc.nextDouble();
//            sc.nextLine();
//
//            System.out.print("Enter warranty: ");
//            String compWarranty = sc.nextLine();
//
//            System.out.print("Enter CPU model: ");
//            String cpuModel = sc.nextLine();
//
//            System.out.print("Enter CPU speed (GHz): ");
//            double cpuSpeed = sc.nextDouble();
//            sc.nextLine();
//
//            System.out.print("Enter RAM size (GB): ");
//            int ramSize = sc.nextInt();
//            sc.nextLine();
//
//            System.out.print("Enter Storage type (SSD/HDD): ");
//            String storageType = sc.nextLine();
//
//            System.out.print("Enter Storage size (GB): ");
//            int storageSize = sc.nextInt();
//            sc.nextLine();
//
//            System.out.print("Enter Operating System: ");
//            String osName = sc.nextLine();
//
//            CPU cpu = new CPU(cpuModel, cpuSpeed);
//            RAM ram = new RAM(ramSize);
//            Storage storage = new Storage(storageSize, storageType);
//            operatingSystem os = new operatingSystem(osName);
//
//            Computer computer = new Computer(compBrand, compWatt, compWarranty, cpu, ram, storage, os);
//            computer.display();


        //Refrigerator//
        System.out.println("Refrigerator");
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter wattage (W): ");
        double watt = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter warranty: ");
        String warranty = sc.nextLine();

        System.out.print("Enter temperature (°C): ");
        double temp = sc.nextDouble();
        }
    }













