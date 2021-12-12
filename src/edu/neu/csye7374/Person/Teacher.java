package edu.neu.csye7374.Person;

import java.util.Date;

public class Teacher extends Person{

    private int credits;

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


    public Teacher(String name, Date dateOfBirth, int age, Date enrollmentDate, int credits) {
        super(name, dateOfBirth, age, enrollmentDate);
        setCredits(credits);
    }
}
