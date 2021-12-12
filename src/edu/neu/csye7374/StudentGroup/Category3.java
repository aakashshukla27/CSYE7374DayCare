package edu.neu.csye7374.StudentGroup;

import edu.neu.csye7374.Person.Student;

public class Category3 extends State{
    private int groupSize = 6;
    public Category3(Student student) {
        super(student);
    }

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
        return "25-35 months. Group size = " + groupSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Category3";
}