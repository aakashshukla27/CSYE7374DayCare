import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        demo();
    }

    public static void demo(){
//        Scanner sc = new Scanner(System.in);
//        List<Student> students = new ArrayList<>();
//        while(true){
//            System.out.println("Enter student details (name, age): \nPress y to exit");
//            String student = sc.nextLine();
//            if(sc.toString().equals("y")) break;
//            else{
//                String[] split = sc.toString().split(" ");
//                Student s = new Student(split[0], Integer.parseInt(split[1]));
//                students.add(s);
//            }
//        }
//
//        System.out.println("\nOutput\n");
//        for(Student student : students){
//            System.out.println(student.toString());
//        }

        Student student1 = new Student("Jimmy", 12, 1);
        Student student2 = new Student("Sally", 23, 2);

        System.out.println(student1.toString());
        student1.addAge();
        System.out.println(student1.toString());

        System.out.println("--------------------------------------------------------");

        System.out.println(student2.toString());
        student2.addAge();
        student2.addAge();
        student2.addAge();
        System.out.println(student2.toString());

    }
}
