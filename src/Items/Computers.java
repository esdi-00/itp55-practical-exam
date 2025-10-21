package Items;

import AppliancesOpenTime.OpenTime;

public class Computers extends Appliance implements OpenTime
{
    private String CPU;
    private String OperatingSystem;

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public String getCPU() {
        return CPU;
    }

    @Override
    public int OpenedTime(int Hours)
    {
        return 35 * Hours;
    }

}
