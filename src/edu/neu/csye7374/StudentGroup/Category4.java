package edu.neu.csye7374.StudentGroup;

import edu.neu.csye7374.Person.Student;

public class Category4 extends State{
    private int groupSize = 8;
    public Category4(Student student) {
        super(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Category4";
    @Override
    public void setGroup() {

    }

    @Override
    public String getGroup() {
        return null;
    }

    @Override
    public int getGroupSize() {
        return groupSize;
    }

    @Override
    public String ageRangeOfGroup() {
        return "36-47 months. Group size = " + groupSize;
    }
}