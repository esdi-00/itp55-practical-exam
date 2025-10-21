package org.rocs.itp54.ApplianceSystem.Appliance.Computer.Specification.OperatingSystem;

public class operatingSystem {

    private String operatingSystem;
    private String edition;
    private String version;

    public operatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        this.edition = edition;
        this.version = version;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

