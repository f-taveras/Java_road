// Create a Student class and manage a collection of students using ArrayList. Practice add, display, filter, sort, and remove operations.
import java.util.*;

public class Student {
// TODO: Add fields: id, name, age, marks
   private int id;
   private int age;
   private int marks;
   private String name;
// TODO: Add constructor

public Student(int id,int age,int marks,String name){
    this.id = id;
    this.age = age;
    this.marks = marks;
    this.name = name;
    
// TODO: Add toString() method for display
}
    @Override
       public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
    
// TODO: Add getters

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public int getMarks(){
        return marks;
    }
    
    


}

public class Main {
public static void main(String[] args) {
// TODO: Create ArrayList of students

ArrayList<Student> students = new ArrayList<>();

// TODO: Add minimum 5 students

// TODO: Display all students

// TODO: Find students with marks > 75

// TODO: Sort by name

// TODO: Sort by marks

// TODO: Remove students with marks < 40

// TODO: Convert List to Set and observe the result
}
}