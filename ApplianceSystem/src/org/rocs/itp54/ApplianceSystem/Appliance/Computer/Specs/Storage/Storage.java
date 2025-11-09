package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.Storage;

public class Storage {

    //Storage class fields
    private String type;
    private int size;
    private int speed;

    //getter and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Storage Constructor
    public Storage(String type, int size, int speed) {
        this.type = type;
        this.size = size;
        this.speed = speed;
    }
    //Display Output
    @Override
    public String toString() {
        return type + " " + size + " " + speed + " ";
    }

}
