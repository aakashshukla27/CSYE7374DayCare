package edu.neu.csye7374.Person;

import edu.neu.csye7374.ClassRoom.ClassRoom;
import edu.neu.csye7374.Immunization.CovidVaccine;
import edu.neu.csye7374.Immunization.Immunization;
import edu.neu.csye7374.Immunization.Vaccine;
import edu.neu.csye7374.Immunization.VaccineFactory;
import edu.neu.csye7374.StudentGroup.*;

import java.util.Date;
import java.util.List;

public class Student extends Person{
    private String parentName;
    private String address;
    private String phoneNumber;
    private double gpa;
    private Teacher teacher;
    private List<Vaccine> immunizationList;
    private State state;

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    private ClassRoom classRoom;
    public Student(String name, Date dateOfBirth, int age, Date enrollmentDate, String parentName, String address, String phoneNumber){
        super(name, dateOfBirth, age, enrollmentDate);
        setParentName(parentName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setState(age);
        //immunizationList.add(VaccineFactory.getVaccine("covid",6));
    }

    public State getState() {
        return state;
    }

    public void setState(int age) {
        if(age > 6 && age <= 12) this.state = new Category1(this);
        else if(age > 12 && age <=24) this.state = new Category2(this);
        else if(age > 24 && age <=35) this.state = new Category3(this);
        else if(age > 35 && age <=47) this.state = new Category4(this);
        else if(age > 47 && age <=60) this.state = new Category5(this);
        else if(age > 60) this.state = new Category6(this);
    }


    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }


    @Override
    public String toString(){
        return super.toString() + " " + parentName + " " + address + " " + phoneNumber;
    }

    public void addImmunization(String name, int frequency){
        immunizationList.add(VaccineFactory.getVaccine(name,frequency));
        //immunizationList.add(VaccineFactory.getVaccine("covid",6));
    }


}
