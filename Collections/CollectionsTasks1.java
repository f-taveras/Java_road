// Create a Student class and manage a collection of students using ArrayList. Practice add, display, filter, sort, and remove operations.
import java.util.*;
import java.util.stream.Collectors;

class Student implements Comparable<Student> {
// TODO: Add fields: id, name, age, marks
   private int id;
   private int age;
   private int marks;
   private String name;
// TODO: Add constructor

@Override
public int compareTo(Student other){
    return this.name.compareTo(other.name);
}

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

// TODO: Add minimum 5 students - Order of input int id,int age,int marks,String name

students.add(new Student(123456, 23, 89, "Marko"));
students.add(new Student(234567, 18, 79, "Erick"));
students.add(new Student(345678, 20, 67, "Joy"));
students.add(new Student(456789, 15, 100, "Alfredo"));
students.add(new Student(567890, 87, 23, "El Chavo"));

// TODO: Display all students

System.out.println(students.toString());


// TODO: Find students with marks > 75
for(Student student: students){
    if (student.getMarks()> 75){
    System.out.println(student);
        
    }
    
    
}
// TODO: Sort by name

Collections.sort(students);
System.out.println(students);

// TODO: Sort by marks
students.sort(Comparator.comparingInt(Student::getMarks));
System.out.println(students);

// TODO: Remove students with marks < 40

students.removeIf(student -> student.getMarks()<40);
System.out.println(students);


// TODO: Convert List to Set and observe the result


Set<Student> studentSet1 = new HashSet<>(students);
System.out.println("This is a set: " + studentSet1);
}
}