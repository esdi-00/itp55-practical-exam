package org.rocs.itp54.AppliancesSystem.Computer.Storage;

public class Storage {
    private String SSD;
    private String HDD;

    public Storage(String SSD, String HDD) {
        this.SSD = SSD;
        this.HDD = HDD;
    }

    public String getSSD() {
        return SSD;
    }

    public String getHDD() {
        return HDD;
    }
}
