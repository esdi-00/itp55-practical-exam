package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.Storage;

//Storage Class for Computer
public class Storage {
    //Fields for Storage Class
    private int capacity;
    private String type;

    //Constructor
    public Storage(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    //Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //toString method for output
    @Override
    public String toString() {
        return capacity + "GB " + type;
    }
}
