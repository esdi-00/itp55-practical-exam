package Items;


import AppliancesOpenTime.OpenTime;

public class Refrigerator extends Appliance implements OpenTime
{
    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public int OpenedTime(int Hours)
    {
        return 35 * Hours;
    }

}
