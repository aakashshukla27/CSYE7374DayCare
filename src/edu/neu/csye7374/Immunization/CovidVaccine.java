package edu.neu.csye7374.Immunization;

import java.util.Calendar;
import java.util.Date;

public class CovidVaccine extends Vaccine{
    private String vaccineName;
    private int frequency;
    private Calendar nextDate;
    public CovidVaccine(String name, int frequency){
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
