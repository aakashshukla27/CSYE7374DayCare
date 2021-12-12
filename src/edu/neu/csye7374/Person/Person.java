package edu.neu.csye7374.Person;

import java.util.Date;

public class Person {
    private String name;
    private Date dateOfBirth;
    private int age;

    @Override
    public String toString(){
        return name + " " + dateOfBirth + " " + age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    private Date enrollmentDate;

    public Person(String name, Date dateOfBirth, int age, Date enrollmentDate){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.enrollmentDate = enrollmentDate;
    }


}
