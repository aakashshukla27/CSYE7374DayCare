package edu.neu.csye7374.Immunization;

public class VaccineFactory {
    public static Vaccine getVaccine(String name, int frequency){
        if("Covid".equalsIgnoreCase(name)) return new CovidVaccine("Pfizer", 6);
        if("Flu".equalsIgnoreCase(name)) return new FluVaccine("Fluvirin", 12);
        return null;
    }
}
