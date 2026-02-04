
import java.util.ArrayList;


// 1 Create Student class with id, name, age, marks
// 2 Store students in ArrayList
// 3 Add minimum 5 students
// 4 Display all students
// 5 Find students with marks > 75
// 6 Sort by name and marks
// 7 Remove students with marks < 40
// 8 Convert List to Set and explain result


class Assignements{


static class Student {
    int id;
    int age;
    int marks;
    String name;    


}
    




    public static void main(String[] args) {

        Student student1 = new Student();
        student1.id = 542312;
        student1.age = 12;
        student1.marks = 95;
        student1.name = "Stephanie";

        Student student2 = new Student();
        student2.id = 654334;
        student2.age = 14;
        student2.marks = 70;
        student2.name = "Marko";

        Student student3 = new Student();
        student3.id = 987235;
        student3.age = 13;
        student3.marks = 50;
        student3.name = "Allen";

        Student student4 = new Student();
        student4.id = 654786;
        student4.age = 12;
        student4.marks = 40;
        student4.name = "Filomena";
        
        Student student5 = new Student();
        student5.id = 872354;
        student5.age = 17;
        student5.marks = 13;
        student5.name = "El Chavo";


        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        
        System.out.println(students);
    }
}