package org.rocs.itp54.appliance_system;

import org.rocs.itp54.appliance_system.appliance.Appliance;
import org.rocs.itp54.appliance_system.channel.Channel;
import org.rocs.itp54.appliance_system.computer.CPU;
import org.rocs.itp54.appliance_system.computer.Computer;
import org.rocs.itp54.appliance_system.computer.RAM;
import org.rocs.itp54.appliance_system.computer.Storage;
import org.rocs.itp54.appliance_system.exception.InvalidQualityException;
import org.rocs.itp54.appliance_system.operatingsystem.OperatingSystem;
import org.rocs.itp54.appliance_system.refrigerator.Refrigerator;
import org.rocs.itp54.appliance_system.television.Television;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class ApplianceSystem {

    //Static Final Member
    private static final double RATE_PER_KWH = 35.0;

    //Final Member
    private final String systemName = "Appliance Management System";

    public static void main(String[] args) {
        new ApplianceSystem().runSystem(); //Method reference
    }

    public void runSystem() {
        Scanner scanner = new Scanner(System.in);
        List<Appliance> appliances = new ArrayList<>();
        System.out.println("Welcome to the " + systemName);
        System.out.print("Enter the number of appliances to be created: ");
        int numAppliances = scanner.nextInt();
        scanner.nextLine();

        try { //I set the appliance creation in for loop
            for (int i = 1; i <= numAppliances; i++) {
                System.out.println("\nSelect appliance type to create:");
                System.out.println("1. Television");
                System.out.println("2. Computer");
                System.out.println("3. Refrigerator");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter brand name: ");
                String brand = scanner.nextLine();
                System.out.print("Enter wattage (W): ");
                int watt = scanner.nextInt();
                System.out.print("Enter warranty (months): ");
                int warranty = scanner.nextInt();
                scanner.nextLine();

                Appliance appliance = null;

                switch (choice) { //Use switch case for easy choose of appliance creation
                    case 1:
                        System.out.print("Enter maximum channel number: ");
                        int maxChannel = scanner.nextInt();
                        scanner.nextLine();
                        Television tv = new Television("TV" + i, brand, watt, warranty, maxChannel);

                        System.out.print("Enter channel number: ");
                        int chNum = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter channel name: ");
                        String chName = scanner.nextLine();
                        System.out.print("Enter channel quality (SD/HD/FULLHD/ULTRAHD): ");
                        String quality = scanner.nextLine();

                        try {
                            Channel channel = new Channel(chNum, chName, quality);
                            tv.setCurrentChannel(channel);
                        } catch (InvalidQualityException e) {
                            System.out.println("Invalid quality entered. Channel not set.");
                        }
                        appliance = tv;
                        break;

                    case 2:
                        System.out.print("Enter CPU model: ");
                        String cpuModel = scanner.nextLine();
                        System.out.print("Enter CPU frequency (GHz): ");
                        double freq = scanner.nextDouble();
                        scanner.nextLine();
                        CPU cpu = new CPU(cpuModel, freq);

                        System.out.print("Enter RAM size (GB): ");
                        int ramSize = scanner.nextInt();
                        scanner.nextLine();
                        RAM ram = new RAM(ramSize);

                        System.out.print("Enter storage type (SSD/HDD): ");
                        String stType = scanner.nextLine().trim().toUpperCase();
                        Storage.Type type = stType.equals("SSD") ? Storage.Type.SSD : Storage.Type.HDD;
                        System.out.print("Enter storage capacity (GB): ");
                        int cap = scanner.nextInt();
                        scanner.nextLine();
                        Storage storage = new Storage(type, cap);

                        System.out.print("Enter operating system (WINDOWS/LINUX/MACOS/ANDROID): ");
                        String osStr = scanner.nextLine().trim().toUpperCase();
                        OperatingSystem os;
                        try {
                            os = OperatingSystem.valueOf(osStr);
                        } catch (IllegalArgumentException e) {
                            os = OperatingSystem.LINUX;
                        }

                        appliance = new Computer("PC" + i, brand, watt, warranty, cpu, ram, storage, os);
                        break;

                    case 3:
                        System.out.print("Enter temperature (°C): ");
                        double temp = scanner.nextDouble();
                        scanner.nextLine();
                        appliance = new Refrigerator("RF" + i, brand, watt, warranty, temp);
                        break;

                    default:
                        System.out.println("Invalid choice. Skipping appliance.");
                        continue;
                }

                //Compute total cost
                System.out.print("Enter number of hours used: ");
                double hours = scanner.nextDouble();
                scanner.nextLine();
                double cost = (appliance.getWattage() / 1000.0) * hours * RATE_PER_KWH;
                System.out.printf("Estimated electricity cost: ₱%.2f%n", cost);

                appliances.add(appliance);
                System.out.println("Appliance created: " + appliance.getDetails());
            }

            //Lambda Expression
            appliances.forEach(a -> System.out.println("→ " + a.getDetails()));

            //Method Reference
            System.out.println("\n=== Using Method Reference to print all appliance details ===");
            appliances.forEach(System.out::println);

            //File Handling
            saveToFile(appliances);

        } catch (Exception e) {
            //TryCatch
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\nSystem execution finished.");
            scanner.close();
        }
    }

    //File Handling
    private void saveToFile(List<Appliance> appliances) {
        try (FileWriter writer = new FileWriter("appliances_output.txt")) {
            for (Appliance a : appliances) {
                writer.write(a.getDetails() + "\n");
            }
            System.out.println("\nAppliance details saved to appliances_output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    //Overriding Object Class
    @Override
    public String toString() {
        return "System Name: " + systemName + ", Rate: " + RATE_PER_KWH;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ApplianceSystem)) return false;
        ApplianceSystem other = (ApplianceSystem) obj;
        return Objects.equals(this.systemName, other.systemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemName);
    }
}
