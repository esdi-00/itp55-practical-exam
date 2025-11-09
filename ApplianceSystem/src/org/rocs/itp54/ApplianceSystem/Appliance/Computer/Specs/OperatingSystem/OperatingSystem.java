package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specs.OperatingSystem;

public class OperatingSystem {
    //OS Constructor
    public OperatingSystem(String name, String version, String type){
        this.name = name;
        this.version = version;
        this.type = type;
    }
    //OS Class fields
    private String name;
    private String version;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   // display output
    @Override
    public String toString() {
        return name + " " + version + " " + type + " ";
    }




}
