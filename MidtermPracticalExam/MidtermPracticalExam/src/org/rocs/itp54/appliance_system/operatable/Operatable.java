package org.rocs.itp54.appliance_system.operatable;

@FunctionalInterface //Functional Interfaces
public interface Operatable {
    //Turns on or operate for a certain period in hours
    void operateForHours(double hours);
}
