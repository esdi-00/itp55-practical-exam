package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.RAM;

//RAM Class for Computer
public class RAM {
    //Fields for RAM Class
    private int size;
    private String type;

    //Constructor
    public RAM(int size, String speed) {
        this.size = size;
        this.type = speed;
    }

    //Getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //toString method for output
    @Override
    public String toString() {
        return size + "GB " + type;
    }
}
