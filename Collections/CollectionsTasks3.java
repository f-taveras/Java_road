
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
        employeeSalary.replace("Buddy", 1.99);

// TODO: Find employees with salary > 50000
        employeeSalary.forEach((name, salary) -> {
            if (salary > 50000) {
                System.out.println(name + " -> " + salary);
            }
        });

// TODO: Find employee with highest salary
        final double[] maxSalary = {0};
        LinkedHashMap<String, Double> highestSalary = new LinkedHashMap<>();
        employeeSalary.forEach((name, salary) -> {
            if (salary > maxSalary[0]) {
                maxSalary[0] = salary;
                System.out.println(name + " -> " + maxSalary[0]);
            }
        });





// TODO: Sort HashMap by salary (descending)

LinkedHashMap<String, Double> descendingSalaries = employeeSalary.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed()).collect(LinkedHashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), Map::putAll);  

System.out.println(descendingSalaries);




    }






}
