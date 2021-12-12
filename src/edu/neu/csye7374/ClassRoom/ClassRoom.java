package edu.neu.csye7374.ClassRoom;

import edu.neu.csye7374.Person.Student;
import edu.neu.csye7374.Person.Teacher;
import edu.neu.csye7374.StudentGroup.State;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom implements IClassRoom{

    private int capacity;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Teacher> teachers;
    private List<Student> students;
    private int category1Count = 0;
    private int category2Count = 0;
    private int category3Count = 0;
    private int category4Count = 0;
    private int category5Count = 0;
    private int category6Count = 0;


    public ClassRoom(int size){
        setCapacity(size);
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void addStudent(Student student) {
        String state = student.getState().getClass().getName();

        String[] temp = (student.getState().getClass().getName()).split(".");
       // String state = temp[temp.length - 1];
        System.out.println(state);
        students.add(student);

    }

    @Override
    public boolean isFull() {
        return (students.size() > capacity);
    }


}
