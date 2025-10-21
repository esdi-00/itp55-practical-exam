package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specifications.OperatingSystem;

//OperatingSystem Class
public class OperatingSystem {
    //Fields for OperatingSystem Class
    private String operatingSystem;
    private String version;

    //Getters and setters

    public OperatingSystem(String operatingSystem, String version) {
        this.operatingSystem = operatingSystem;
        this.version = version;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    //toString method for output
    @Override
    public String toString() {
        return operatingSystem + " " + version;
    }
}
