package edu.neu.csye7374.StudentGroup;

import edu.neu.csye7374.Person.Student;

public class Category1 extends State{
    private int groupSize = 4;
    private String name = "Category1";
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public Category1(Student student) {
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
        return "6-12 months. Group size = " + groupSize;
    }
}
