package org.rocs.itp54.ApplianceSystem.Appliance.Television.Channel.Quality;

import org.rocs.itp54.ApplianceSystem.Exception.InvalidQualityException;

//Enum for quality field in Channel
public enum Quality {
    //Enum value names and description
    STANDARD_DEFINITION("Standard Definition"),
    HIGH_DEFINITION("High Definition"),
    FULL_HD("Full HD"),
    ULTRA_HD("Ultra HD");

    //Description so input that uses spaces still work
    private final String description;
    Quality(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    //Method that checks if string input is in enum, throws InvalidQualityException if not
    public static Quality fromString(String text) throws InvalidQualityException {
        for (Quality q : Quality.values()) {
            if (q.description.equalsIgnoreCase(text) || q.name().equalsIgnoreCase(text)) {
                return q;
            }
        }
        throw new InvalidQualityException("Invalid quality: " + text);
    }

}
