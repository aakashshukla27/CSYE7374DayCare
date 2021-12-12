package edu.neu.csye7374.Immunization;

import java.util.Calendar;

public abstract class Vaccine {
    public abstract String getName();
    public abstract int getFrequency();
    public abstract Calendar nextDate();

    @Override
    public String toString(){
        return "Vaccine = " + this.getName() + ", Frequency = " + this.getFrequency();
    }
}
