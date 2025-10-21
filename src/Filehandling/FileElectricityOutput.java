package Filehandling;

import ApliancesData.ComputerData;
import Items.Computers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileElectricityOutput
{
    public void CreateFile()
    {
        try {
            File myObj = new File("C:\\Users\\Admin\\Downloads\\OverAll.txt"); // Create File object
            if (myObj.createNewFile()) {           // Try to create the file
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    // print the overAll of the
    public void PrintContents(ArrayList<Integer> ElectricCharge)
    {
        try
        {
            FileWriter writer = new FileWriter("C:\\Users\\Admin\\Downloads\\OverAll.txt");
            writer.write("" +
                    "\n computer consumed electricity per peso: " +ElectricCharge.get(0) +
                    "\n Refrigerator consumed electricity per peso: " +ElectricCharge.get(1) +
                    "\n Television consumed electricity per peso: "+ ElectricCharge.get(2) +
                    "\n Over all peso cost: "+ (ElectricCharge.get(0)+ElectricCharge.get(1)+ElectricCharge.get(2))
            );
            writer.append("\n by Carl Justine Cain ");
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


}
