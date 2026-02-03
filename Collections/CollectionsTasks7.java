import java.util.*;
import java.util.stream.*;

class Student {
private String name;
private double marks;

public Student(String name, double marks) {
this.name = name;
this.marks = marks;
}

public String getName() { return name; }
public double getMarks() { return marks; }

@Override
public String toString() {
return name + " (" + marks + ")";
}
}

public class Main {
public static void main(String[] args) {
List<Student> students = Arrays.asList(
new Student("Alice", 85.5),
new Student("Bob", 65.0),
new Student("Charlie", 92.0),
new Student("Diana", 78.5),
new Student("Eve", 45.0),
new Student("Frank", 88.0)
);

// TODO: Find average marks using streams


Stream<Student> s1 = students.stream();
// s1.forEach(n -> System.out.println(n));

Double averageMarks = students.stream().mapToDouble(Student::getMarks).average().orElse(0.0);
System.out.println(averageMarks);


// TODO: Find topper (student with highest marks)
Student topper = students.stream().max(Comparator.comparingDouble(Student::getMarks)).orElse(null);
System.out.println(topper);



// TODO: Group students into pass (>=50) and fail (<50)
Map<String, List<Student>> partitioned = students.stream()
    .collect(Collectors.groupingBy(
        s -> s.getMarks() >= 50 ? "Pass" : "Fail"
    ));
                
System.out.println(partitioned.get("Pass"));
System.out.println(partitioned.get("Fail"));

// TODO: Sort by marks descending

List<Student> descendingMarks = students.stream().sorted(Comparator.comparingDouble(Student::getMarks).reversed()).collect(Collectors.toList());
System.out.println(descendingMarks);


// Student descendingMarks = students.stream().ordered().reversed();


// TODO: Collect all student names into a List
List<String> studentNames = students.stream().map(Student::getName).collect(Collectors.toList());
System.out.println(studentNames);

    
    
}
}