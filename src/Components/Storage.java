package Components;

import Items.Computers;

public class Storage extends Computers
{
    private String type; // HDD or SSD
    private int capacityGB; // 512, 1000

    public Storage(String type, int capacityGB)
    {
        this.type = type;
        this.capacityGB = capacityGB;
    }
}
