package ApliancesData;

import Components.RAM;
import Components.Storage;
import Items.Computers;

public class ComputerData
{
    private Computers com;
    private RAM ram;
    private Storage storage;

    // this class will set the default data of the computer class
    public ComputerData()
    {
        Computers com = new Computers();
        com.setCPU("Intel Core i7-8550U");
        com.setOperatingSystem("Windows 11");
        com.setBrandName("Lenovo");

        RAM ram = new RAM("Kingston",512,3200 );
        Storage storage = new Storage("SSD", 100);
    }

    public Computers getComputer()
    {
        return com;
    }

    public RAM getRAM()
    {
        return ram;
    }

    public Storage getStorage()
    {
        return storage;
    }
}
