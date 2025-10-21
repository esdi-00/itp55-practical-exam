package org.rocs.itp54.ApplianceSystem;

import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Computer;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.CPU.CPU;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.OperatingSystem.OperatingSystem;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.RAM.RAM;
import org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.Storage.Storage;
import org.rocs.itp54.ApplianceSystem.Appliance.Refrigerator.Refrigerator;
import org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel.Channel;
import org.rocs.itp54.ApplianceSystem.Appliance.Television.Television;
import org.rocs.itp54.ApplianceSystem.Exception.InvalidQualityException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ApplianceApplication {
    //Main runnable method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //StringBuilder for File Output
        StringBuilder output = new StringBuilder();
        output.append("Appliance Power Consumption Report");

        System.out.println("Choose appliance type:");
        System.out.println("[1] Television");
        System.out.println("[2] Computer");
        System.out.println("[3] Refrigerator");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        double totalCost;
        //Try clause that will catch InvalidCategoryException for Channel Category
        try {
            //Switch case for user appliance choice. (Uses lambda hehe counted na yan sir sayang 5 points)
            switch (choice) {
                //Case for Television
                case 1 -> {
                    System.out.print("Brand name: ");
                    String brand = sc.nextLine();
                    System.out.print("Wattage (W): ");
                    double watt = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Warranty (Date): ");
                    String warranty = sc.nextLine();
                    System.out.print("Max channels: ");
                    int maxCh = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Channel number: ");
                    int chNum = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Channel name: ");
                    String chName = sc.nextLine();
                    System.out.print("Quality (Standard Definition / High Definition / Full HD / Ultra HD): ");
                    String quality = sc.nextLine();

                    //Channel and Television Creation
                    Channel channel = new Channel(chNum, chName, quality);
                    Television tv = new Television(brand, watt, warranty, maxCh, channel);

                    //Calling turnOn method to calculate total cost
                    System.out.print("Hours used: ");
                    double hours = sc.nextDouble();
                    totalCost = tv.turnOn(hours);

                    //Adding all information to string builder for output
                    output.append("\nAppliance Used: Television\n").append(tv).append("\nHours used: ").append(hours).append(" hr(s)\nTotal cost: ₱").append(totalCost);
                }
                //Case for Computer
                case 2 -> {
                    System.out.print("Brand name: ");
                    String brand = sc.nextLine();
                    System.out.print("Wattage (W): ");
                    double watt = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Warranty (Date): ");
                    String warranty = sc.nextLine();
                    System.out.print("CPU model: ");
                    String cpuModel = sc.nextLine();
                    System.out.print("CPU clock speed (GHz): ");
                    double cpuSpeed = sc.nextDouble();
                    System.out.print("CPU cores: ");
                    int cores = sc.nextInt();

                    //CPU Creation
                    CPU cpu = new CPU(cpuModel, cpuSpeed, cores);

                    System.out.print("RAM size (GB): ");
                    int ramSize = sc.nextInt();
                    sc.nextLine();
                    System.out.print("RAM type (e.g., DDR4): ");
                    String ramType = sc.nextLine();

                    //RAM Creation
                    RAM ram = new RAM(ramSize, ramType);

                    System.out.print("Storage capacity (GB): ");
                    int storageCap = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Storage type (SSD/HDD): ");
                    String storageType = sc.nextLine();

                    //Storage Creation
                    Storage storage = new Storage(storageCap, storageType);

                    System.out.print("Operating System: ");
                    String osName = sc.nextLine();
                    System.out.print("OS Version: ");
                    String osVer = sc.nextLine();

                    //OperatingSystem Creation
                    OperatingSystem os = new OperatingSystem(osName, osVer);

                    //Computer Creation
                    Computer pc = new Computer(brand, watt, warranty, cpu, ram, storage, os);

                    //Calling turnOn method to calculate total cost
                    System.out.print("Hours used: ");
                    double hours = sc.nextDouble();
                    totalCost = pc.turnOn(hours);

                    //Adding all information to string builder for output
                    output.append("\nAppliance Used: Computer\n").append(pc).append("\nHours used: ").append(hours).append(" hr(s)\nTotal cost: ₱").append(totalCost);
                }

                //Case for Refrigerator
                case 3 -> {
                    System.out.print("Brand name: ");
                    String brand = sc.nextLine();
                    System.out.print("Wattage (W): ");
                    double watt = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Warranty (Date): ");
                    String warranty = sc.nextLine();
                    System.out.print("Temperature (°C): ");
                    double temp = sc.nextDouble();

                    //Refrigerator Creation
                    Refrigerator ref = new Refrigerator(brand, watt, warranty, temp);

                    //Calling turnOn method to calculate total cost
                    System.out.print("Hours used: ");
                    double hours = sc.nextDouble();
                    totalCost = ref.turnOn(hours);

                    //Adding all information to string builder for output
                    output.append("\nAppliance Used: Refrigerator\n").append(ref).append("\nHours used: ").append(hours).append(" hr(s)\nTotal cost: ₱").append(totalCost);
                }
                //Default case for invalid input
                default -> System.out.println("Invalid choice!");
            }
            //New try clause for FileWriter IOException
            try (FileWriter writer = new FileWriter("appliance_report.txt")) {
                writer.write(output.toString());
                System.out.println("\n Results saved to appliance_report.txt");
            }

        //Catching invalid quality and input output exceptions
        } catch (InvalidQualityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
        }
        //Closing Scanner (for formalities hehe)
        sc.close();
    }
}
