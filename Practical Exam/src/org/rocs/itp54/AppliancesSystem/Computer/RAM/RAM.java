package org.rocs.itp54.AppliancesSystem.Computer.RAM;

public class RAM {

    private String ramBrand;
    private String size;

    public RAM(String ramBrand, String size) {
        this.ramBrand = ramBrand;
        this.size = size;
    }

    public String getRamBrand() {
        return ramBrand;
    }

    public String getSize() {
        return size;
    }
}
