package org.rocs.itp54.AppliancesSystem;

import org.rocs.itp54.AppliancesSystem.Channel.Quality;
import org.rocs.itp54.AppliancesSystem.InvalidQualityException.InvalidQualityException;
import org.rocs.itp54.AppliancesSystem.Operatable.Operatable;

import java.util.Scanner;

public class AppliancesSystem implements Operatable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operatable compute = new AppliancesSystem();

        System.out.println("“Which appliances would you like to use?\n 1. Television\n 2. Computer\n 3. Refrigerator");
        int choices = scanner.nextInt();
        switch (choices) {
            case 1:
            try {
                System.out.println("Enter Channel Name: ");
                String channelName = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Enter Channel Number: ");
                int channelNum = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter quality: ");
                String quality = scanner.nextLine();
                checkQuality(quality);
            } catch (InvalidQualityException e) {
                System.out.println("Invalid quality");
            } finally {
                System.out.println("Enter hours of use: ");
                int totalElectricity = scanner.nextInt();
                double resultCompute = compute.operate(totalElectricity);
                System.out.println("Total consumed electricity: " + resultCompute);
            } break;
            case 2:
                System.out.println("Brand name: ");
                String brand = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Brand wattage: ");
                int wattage = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Brand warranty(Date): ");
                String warranty = scanner.nextLine();
                System.out.println("Brand CPU: ");
                String cpu = scanner.nextLine();
                System.out.println("Storage(SSD or HDD): ");
                String storage = scanner.nextLine();
                System.out.println("Brand Operating System: ");
                String os = scanner.nextLine();
                System.out.println("Enter hours of use: ");
                int totalElectricity = scanner.nextInt();
                double resultCompute = compute.operate(totalElectricity);
                System.out.println("Total consumed electricity: " + resultCompute);
                break;
            case 3:
                System.out.println("Brand name: ");
                String brandName = scanner.nextLine();
                System.out.println("Brand wattage: ");
                int wattageBrand = scanner.nextInt();
                System.out.println("Brand warranty(Date): ");
                String warrantyDate = scanner.nextLine();
                System.out.println("What temperature do you want?: ");
                double temp = scanner.nextDouble();
                System.out.println("Enter hours of use: ");
                int totalElectricity2 = scanner.nextInt();
                double resultCompute2 = compute.operate(totalElectricity2);
                System.out.println("Total consumed electricity: " + resultCompute2);
                break;
            default:
                System.out.println("None of the above");
                break;
        }
    }
    public static void checkQuality(String quality) throws InvalidQualityException {
        for (Quality c : Quality.values()) {
            if (c.name().equalsIgnoreCase(quality)) {
                return;
            }
        }
        throw new InvalidQualityException("Invalid category: " + quality);
    }

    @Override
    public double operate(double hours) {
        return hours * 35;
    }
}