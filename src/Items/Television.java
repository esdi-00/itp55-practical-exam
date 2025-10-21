package Items;

import AppliancesOpenTime.OpenTime;

public class Television extends Appliance implements OpenTime
{
    private String Channel;
    private String maxChannelNumber;

    @Override
    public int OpenedTime(int Hours)
    {
        return 35 * Hours;
    }


}
