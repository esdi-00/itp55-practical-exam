package org.rocs.itp54.appliance_system.exception;

public class InvalidQualityException extends Exception {
    public InvalidQualityException() {
        super("Invalid quality provided.");
    }

    public InvalidQualityException(String message) {
        super(message);
    }
}
