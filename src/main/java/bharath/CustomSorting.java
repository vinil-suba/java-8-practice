package bharath;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSorting {
    public static List<Emp> sortEmployeesByFirstName(List<Emp> employees) {
        return employees.stream()
                .sorted(Comparator.comparing(Emp::getFirstName))
                .collect(Collectors.toList());  // Use .collect(Collectors.toList()) for older versions of Java
    }

    public static void main(String[] args) {
        List<Emp> employees = new ArrayList<>();
        employees.add(new Emp("John", "Doe"));
        employees.add(new Emp("Alice", "Smith"));
        employees.add(new Emp("Jane", "Doe"));
        employees.add(new Emp("Bob", "Johnson"));

        List<Emp> sortedEmployees = sortEmployeesByFirstName(employees);

        sortedEmployees.forEach(System.out::println);
    }
}


