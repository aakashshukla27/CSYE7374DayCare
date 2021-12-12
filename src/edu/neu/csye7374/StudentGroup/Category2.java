package edu.neu.csye7374.StudentGroup;

import edu.neu.csye7374.Person.Student;

public class Category2 extends State{
    private int groupSize = 5;
    public Category2(Student student) {
        super(student);
    }
    private String name = "Category2";
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
        return "13-24 months. Group size = " + groupSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}