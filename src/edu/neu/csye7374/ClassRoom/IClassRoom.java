package edu.neu.csye7374.ClassRoom;

import edu.neu.csye7374.Person.Student;
import edu.neu.csye7374.Person.Teacher;

public interface IClassRoom {
    public void addTeacher(Teacher teacher);
    public void addStudent(Student student);
    public boolean isFull();
}
