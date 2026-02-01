import java.util.*;


public class CollectionsTasks3 {
public static void main(String[] args) {
// TODO: Create HashMap<String, Double> for employee name and salary


Map<String, Double> employeeSalary = new HashMap<>();

// TODO: Add 5 employees with salaries

employeeSalary.put("Ramon", 10678.90);
employeeSalary.put("Nathan", 100678.0);
employeeSalary.put("Valery", 1678.40);
employeeSalary.put("Cleo", 678.99);
employeeSalary.put("Buddy", 0.99);


// TODO: Display all employees
for (Map.Entry<String, Double> entry : employeeSalary.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

// TODO: Update salary of one employee

// TODO: Find employees with salary > 50000

// TODO: Find employee with highest salary

// TODO: Sort HashMap by salary (descending)
}
}