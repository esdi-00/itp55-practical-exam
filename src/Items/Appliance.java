package Items;

public class Appliance
{
    private String brandName;
    private int wattage;
    private String warrantyProperty;

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public void setWarrantyProperty(String warrantyProperty) {
        this.warrantyProperty = warrantyProperty;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getWattage() {
        return wattage;
    }

    public String getWarrantyProperty() {
        return warrantyProperty;
    }

}
