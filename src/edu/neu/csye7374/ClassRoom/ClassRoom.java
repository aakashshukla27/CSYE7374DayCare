package edu.neu.csye7374.ClassRoom;

import edu.neu.csye7374.Person.Student;
import edu.neu.csye7374.Person.Teacher;
import edu.neu.csye7374.StudentGroup.State;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClassRoom implements IClassRoom{

    private int capacity;
    private List<Teacher> teachers;
    private List<Student> students;
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private HashMap<State, List<Student>>  studentList;


    public ClassRoom(int size){
        setCapacity(size);
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        studentList = new HashMap<>();
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
        //if(studentList.containsKey())
        students.add(student);

    }

    @Override
    public boolean isFull() {
        return (students.size() > capacity);
    }


}
