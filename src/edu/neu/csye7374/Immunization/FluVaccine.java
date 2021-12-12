package edu.neu.csye7374.Immunization;

import java.util.Calendar;

public class FluVaccine extends Vaccine{
    private String vaccineName;
    private int frequency;
    private Calendar nextDate;

    public FluVaccine(String name, int frequency){
        this.vaccineName = name;
        this.frequency = frequency;
    }
    @Override
    public String getName() {
        return vaccineName;
    }

    @Override
    public int getFrequency() {
        return frequency;
    }

    @Override
    public Calendar nextDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, this.frequency);
        return cal;
    }
}
