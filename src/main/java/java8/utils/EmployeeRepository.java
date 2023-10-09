package java8.utils;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public static List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1, "vinil", "suba", 120, 2020, "MALE", 26, true, "Development"),
                new Employee(2, "anusha", "illa", 130, 2021, "FEMALE", 27, true, "Testing"),
                new Employee(3, "kalyani", "satti", 140, 2021, "FEMALE", 28, true, "Devoops"),
                new Employee(4, "sai", "kiran", 100, 2019, "MALE", 29, false, "Development"),
                new Employee(5, "inatayath", "patan", 150, 2018, "MALE", 22, false, "Testing"),
                new Employee(6, "vamsi", "suba", 199, 2016, "MALE", 20, false, "Devoops"),
                new Employee(7, "shivani", "deva", 200, 2019, "FEMALE", 25, true, "Kafka"),
                new Employee(8, "rajesh", null, 99, 2023, "MALE", 24, true, "Okta")
        );
    }
}
