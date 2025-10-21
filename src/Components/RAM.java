package Components;

import Items.Computers;

public class RAM extends Computers
{
    private String brand;
    private int sizeGB;
    private int speedMHz;

    public RAM(String brand, int sizeGB, int speedMHz)
    {
        this.brand = brand;
        this.sizeGB = sizeGB;
        this.speedMHz = speedMHz;
    }
}
