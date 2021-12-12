package edu.neu.csye7374.StudentGroup;

import edu.neu.csye7374.Person.Student;

public abstract class State {
    Student student;
    public State(Student student){
        this.student = student;
    }

    public abstract void setGroup();
    public abstract String getGroup();
    public abstract int getGroupSize();
    public abstract String ageRangeOfGroup();

    public abstract String getName();
}
