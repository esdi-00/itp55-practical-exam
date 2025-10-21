import ApliancesData.ComputerData;
import Channels.Quality;
import Filehandling.FileElectricityOutput;
import Exception.InvalidQualityException;
import Items.Appliance;
import Items.Computers;
import Items.Refrigerator;
import Items.Television;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static Scanner sc;
    private static ArrayList<Appliance> appliances = new ArrayList<>();

    // private static ComputerData computerData = new ComputerData(); // for default Data
    private static FileElectricityOutput fileElectricityOutput = new FileElectricityOutput();
    private static ArrayList<Integer>ElectricCharge = new ArrayList<>();

    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        try
        {
            setTelevisionQuality();
            setAppliances();
            CreateFile();

            sc.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    // still not done
    // this will set the quality of the TV
    public static Quality setTelevisionQuality() throws InvalidQualityException
    {
        System.out.print("Enter Book Television Quality: ");
        String quality = sc.nextLine().toUpperCase();

        if(quality.equals("STANDARD"))
        {
            return Quality.Standard;
        }
        else if(quality.equals( "DEFINITION"))
        {
            return Quality.Definition;
        }
        else if(quality.equals( "HIGH_DEFINITION"))
        {
            return Quality.High_Definition;
        }
        else if(quality.equals( "FULL_HD"))
        {
            return Quality.Full_HD;
        }
        else if(quality.equals( "ULTRA_HD"))
        {
            return Quality.Ultra_HD;
        }
        else
        {
            throw new InvalidQualityException("Exception: The Quality is invalid");
        }
    }

    // will set the appliances specific time (by Hour)
    public static void setAppliances()
    {
        Computers com = new Computers();
        System.out.print("how many hours a computer is opened: ");
        int ComputerHours = sc.nextInt();
        ElectricCharge.add(com.OpenedTime(ComputerHours));

        Refrigerator ref = new Refrigerator();
        System.out.print("how many hours a Refrigerator is opened: ");
        int RefHours = sc.nextInt();
        ElectricCharge.add(ref.OpenedTime(RefHours));

        Television tel = new Television();
        System.out.print("how many hours a Television is opened: ");
        int telHours = sc.nextInt();
        ElectricCharge.add(tel.OpenedTime(telHours));

        // lambda
        // checking Hours if right data
        ElectricCharge.forEach((x) -> System.out.println("Checking: "+x));

    }

    // create output file
    public static void CreateFile()
    {
        fileElectricityOutput.CreateFile();
        fileElectricityOutput.PrintContents(ElectricCharge);
    }
}

