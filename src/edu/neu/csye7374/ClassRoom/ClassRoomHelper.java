package edu.neu.csye7374.ClassRoom;

import edu.neu.csye7374.Person.Student;

import java.util.List;

public class ClassRoomHelper {
    private final int category1Count = 3;
    private final int category2Count = 3;
    private final int category3Count = 3;
    private final int category4Count = 3;
    private final int category5Count = 2;
    private final int category6Count = 2;

    public String AssignClassRoom(List<ClassRoom> classRooms, Student student){
        for(ClassRoom classRoom : classRooms){
            if(student.getState().getName().equals("Category1")){
                if(checkClassRoomCat1(classRoom, student)){
                    student.setClassRoom(classRoom);
                    return "Student added to classroom " + classRoom.toString();
                }
            }
            if(student.getState().getName().equals("Category2")){
                if(checkClassRoomCat1(classRoom, student)){
                    student.setClassRoom(classRoom);
                }
            }
            if(student.getState().getName().equals("Category3")){
                if(checkClassRoomCat1(classRoom, student)){
                    student.setClassRoom(classRoom);
                }
            }
            if(student.getState().getName().equals("Category4")){
                if(checkClassRoomCat1(classRoom, student)){
                    student.setClassRoom(classRoom);
                }
            }
            if(student.getState().getName().equals("Category5")){
                if(checkClassRoomCat1(classRoom, student)){
                    student.setClassRoom(classRoom);
                }
            }
            if(student.getState().getName().equals("Category6")){
                if(checkClassRoomCat1(classRoom, student)){
                    student.setClassRoom(classRoom);
                }
            }
        }
        return "Student could not be added, Add a new classroom";
    }

    public boolean checkClassRoomCat1(ClassRoom classRoom, Student student){
        int cat1current = 0;
        for(int i=0; i<classRoom.getStudents().size(); i++) {
            Student s = classRoom.getStudents().get(i);
            if (s.getState().getClass().toString().equals("Category1")) {
                if(cat1current/s.getState().getGroupSize() > category1Count){
                    return false;
                }
                else{
                    cat1current++;
                }
            }
        }
        return true;
    }
    public boolean checkClassRoomCat2(ClassRoom classRoom, Student student){
        int cat1current = 0;
        for(int i=0; i<classRoom.getStudents().size(); i++) {
            Student s = classRoom.getStudents().get(i);
            if (s.getState().getClass().toString().equals("Catgory2")) {
                if(cat1current/s.getState().getGroupSize() > category2Count){
                    return false;
                }
                else{
                    cat1current++;
                }
            }
        }
        return true;
    }
    public boolean checkClassRoomCat3(ClassRoom classRoom, Student student){
        int cat1current = 0;
        for(int i=0; i<classRoom.getStudents().size(); i++) {
            Student s = classRoom.getStudents().get(i);
            if (s.getState().getClass().toString().equals("Catgory3")) {
                if(cat1current/s.getState().getGroupSize() > category3Count){
                    return false;
                }
                else{
                    cat1current++;
                }
            }
        }
        return true;
    }
    public boolean checkClassRoomCat4(ClassRoom classRoom, Student student){
        int cat1current = 0;
        for(int i=0; i<classRoom.getStudents().size(); i++) {
            Student s = classRoom.getStudents().get(i);
            if (s.getState().getClass().toString().equals("Catgory4")) {
                if(cat1current/s.getState().getGroupSize() > category4Count){
                    return false;
                }
                else{
                    cat1current++;
                }
            }
        }
        return true;
    }
    public boolean checkClassRoomCat5(ClassRoom classRoom, Student student){
        int cat1current = 0;
        for(int i=0; i<classRoom.getStudents().size(); i++) {
            Student s = classRoom.getStudents().get(i);
            if (s.getState().getClass().toString().equals("Catgory5")) {
                if(cat1current/s.getState().getGroupSize() > category5Count){
                    return false;
                }
                else{
                    cat1current++;
                }
            }
        }
        return true;
    }
    public boolean checkClassRoomCat6(ClassRoom classRoom, Student student){
        int cat1current = 0;
        for(int i=0; i<classRoom.getStudents().size(); i++) {
            Student s = classRoom.getStudents().get(i);
            if (s.getState().getClass().toString().equals("Catgory6")) {
                if(cat1current/s.getState().getGroupSize() > category6Count){
                    return false;
                }
                else{
                    cat1current++;
                }
            }
        }
        return true;
    }


}
