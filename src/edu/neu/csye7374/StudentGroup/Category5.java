package edu.neu.csye7374.StudentGroup;

import edu.neu.csye7374.Person.Student;

public class Category5 extends State{
    private int groupSize = 12;
    public Category5(Student student) {
        super(student);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Category5";
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
        return "48-59 months. Group size = " + groupSize;
    }
}