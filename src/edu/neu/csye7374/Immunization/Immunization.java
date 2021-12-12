package edu.neu.csye7374.Immunization;

import java.util.Date;

public class Immunization {
    private Vaccine vaccineName;
    private int frequency;

    public String getVaccineName() {
        return vaccineName.getName();
    }

//    public void setVaccineName(String vaccineName) {
//        this.vaccineName. = vaccineName;
//    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Date getLastAdministeredDate() {
        return lastAdministeredDate;
    }

    public void setLastAdministeredDate(Date lastAdministeredDate) {
        this.lastAdministeredDate = lastAdministeredDate;
    }

    private Date lastAdministeredDate;
}
