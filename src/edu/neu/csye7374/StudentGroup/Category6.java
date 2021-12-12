package edu.neu.csye7374.StudentGroup;

import edu.neu.csye7374.Person.Student;

public class Category6 extends State{
    private int groupSize = 15;
    public Category6(Student student) {
        super(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Category6";
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
        return "60 months and above. Group size = " + groupSize;
    }
}