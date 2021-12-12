package edu.neu.csye7374;

import edu.neu.csye7374.ClassRoom.ClassRoom;
import edu.neu.csye7374.Person.Student;
import edu.neu.csye7374.Person.Teacher;

import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        ClassRoom c1 = new ClassRoom(20);
        ClassRoom c2 = new ClassRoom(20);
        ClassRoom c3 = new ClassRoom(50);


        Student s1 = new Student("John Doe", new Date(), 15, new Date(), "Parent Name", "Address 1", "12345");
        Student s2 = new Student("Michael Doe", new Date(), 15, new Date(), "Parent Name", "Address 2", "12345");
        Teacher t1 = new Teacher("Teacher 1", new Date(), 35, new Date(), 10);

        c1.addTeacher(t1);
        c1.addStudent(s1);
        c1.addStudent(s2);
    }
}
