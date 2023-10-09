package java8.iQs.streams;

import java8.utils.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java8.utils.EmployeeRepository.getAllEmployees;

public class MainQuestions {
    static List<Employee> staticEmployeeList = getAllEmployees();
    public static void main(String[] args) {

        findDuplicatesInGivenArrayAndGivenList();
        getAllEmployeesDepartmentCount();
        findHighestPaidSalary();
        returnMapOfStringKeyAddressValue();
        useCompareTwiceToCheckTheValues();
        useIfPresentInStream();
        getAllEmployeesIfTheStatusIsInActive();
        useOptionalProperties();
        getEmployeesBasedOnASDC();
        getGenderListBasedOnDelimiter();
        getGenderCount();
        getEmployeeByGivenId();
        get8thEmployeeDetails();
        getEmployeesWithPipeAndConcatOfFullNameandLastName();
        getMaxEmployeeIdListBasedOnEmpId();
//        sortedEmpListBasedOnFirstName();
//        System.out.println("------------------");
//        getSortedEmployeesListBasedOnEmployeeLastname();
//        getEmployeesWhoAreNotBelogsToGivenDept();
//        addZerosIfTheGivenStringHasLessThen4digits();

//        getMatchingNames();
//
//        getMapWithDesiredValues();
//
//        getFullName();
//        findTheAverageOfGivenNumbers();
//        whatIsPeekExampleInJavaStreams();
        findTheSecondHighestSalaryInGivenEmployeeList();

    }

    private static void findTheSecondHighestSalaryInGivenEmployeeList() {
        Employee employee = staticEmployeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(employee);
    }

    private static void whatIsPeekExampleInJavaStreams() {
        // peek is a useful tool for debugging and understanding what's happening in your stream pipeline,
        // especially when dealing with complex transformations and filters.
        staticEmployeeList
                .stream()
                .map(Employee::getFullName)
                .peek(employee -> System.out.println("employee map: " + employee))
                .forEach(System.out::println);
    }

    private static void findTheAverageOfGivenNumbers() {
        //How to find the average of numbers using java streams
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5);
        OptionalDouble average = integerList
                .stream()
                .mapToDouble(value -> value)// To convert int to double
                .average();
        average.ifPresent(System.out::println);
    }

    private static void findDuplicatesInGivenArrayAndGivenList() {
        String[] givenString = {"vinil", "vamsi", "vijay", "anusha", "shivani", "durga", "vijay"};

        Map<String, Long> stringCollect = Arrays
                .stream(givenString)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println("find Duplicates in given string array: "+ stringCollect);
    }

    private static void getAllEmployeesDepartmentCount() {
        //Find the highest and lowest paid salary employees by using streams
        Map<String, Long> departmentWithCount = staticEmployeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("departmentWithCount "+departmentWithCount);
    }

    private static void findHighestPaidSalary() {
        //Find the highest and lowest paid salary employees by using streams
        Employee highestPaidEmployee = staticEmployeeList
                .stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        System.out.println(highestPaidEmployee+ " highestPaidEmployee");

        Employee lessPaidEmployee = staticEmployeeList
                .stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        System.out.println(lessPaidEmployee+ " lessPaidEmployee");
    }

    private static void returnMapOfStringKeyAddressValue() {
        //Return Map<String, Address> where is key is firstName+lastname and value will be address object.
        Map<String, Double> mapKeyValue = staticEmployeeList
                .stream()
                .collect(Collectors.toMap(
                        key -> key.getFullName(),
                        value -> value.getSalary()
                ));
        System.out.println(mapKeyValue);
    }

    private static void useCompareTwiceToCheckTheValues() {
        //Sort address based on city and then country. use thenComparing.
        List<Employee> compareTwice = staticEmployeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getGender)
                        .thenComparing(Comparator.comparing(Employee::getFirstName)))
                .collect(Collectors.toList());
        compareTwice
                .forEach(System.out::println);
    }

    private static void useIfPresentInStream() {
        //If deptName is "IT" update salary, use ifpresent
        String givenDept = "Development";
        staticEmployeeList
                .stream()
                .filter(employee -> employee.getDepartment().equals(givenDept))
                .findFirst()
                .ifPresent(result -> System.out.println(" the Final result is: "+ result));
    }

    private static void getAllEmployeesIfTheStatusIsInActive() {
        //Return all the employees data if address is not available for that employee provide.
        Employee employee = new Employee();
        Optional<String> active = Optional.ofNullable(employee.getFirstName());
        active.orElse("The status is not available");
    }

    private static void useOptionalProperties() {
        double empSalary;
//        there are some scenarios the salary might get null values,
//        user Optional when the properties should not return null values..
        /*public Optional<String> getLastName() {
            return Optional.of(empSalary);
        }*/
    }

    private static void getEmployeesBasedOnASDC() {
        //Get all the employees in ascending order based on the salary.
        List<Employee> collect = staticEmployeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        //Get all the employees in DSED order based on the salary.
        System.out.println("------------------");
        List<Employee> collect1 = staticEmployeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        collect1.forEach(System.out::println);

    }

    private static void getGenderListBasedOnDelimiter() {
        //get Male and females list separetly and join the employee full names with delimeter -.
        //ex: MALE = {[Jhon-Mike-Jack]} and FEMALE

        // Separate employees into male and female lists
        List<Employee> maleEmployees = staticEmployeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.toList());

        List<Employee> femaleEmployees = staticEmployeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.toList());

        // Join full names with delimiter "-"
        String maleFullNameList = maleEmployees.stream()
                .map(Employee::getFullName)
                .collect(Collectors.joining("-"));

        String femaleFullNameList = femaleEmployees.stream()
                .map(Employee::getFullName)
                .collect(Collectors.joining("-"));

        // Print the results
        System.out.println("MALE = {" + "[" + maleFullNameList + "]" + "}");
        System.out.println("FEMALE = {" + "[" + femaleFullNameList + "]" + "}");
    }

    private static void getGenderCount() {
        //Consider a list of employees and get the count of employees based on the Gender
        Map<String, Long> collect = staticEmployeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);
    }

    private static void getEmployeeByGivenId() {
//consider list of employees and list of employee ids. return the list
//     of employees matching with the given list of employee ids.
        List<Integer> empIds = Arrays.asList(1, 2, 4);
        List<Employee> collect = staticEmployeeList
                .stream()
                .filter(employee -> empIds.contains(employee.getEmployeeId()))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    private static void get8thEmployeeDetails() {
        //Consider a list of 10 employees, get the 8th employee and print his full name and department name.
//        String found8thEmployee = staticEmployeeList
        staticEmployeeList
                .stream()
                .skip(7)
                .findFirst()
//                .map(Employee::getFullName)
//                .map(Employee::getDepartment)
                .ifPresent(employee -> {
                    System.out.println("Full Name of 8th Employee: " + employee.getFullName());
                    System.out.println("Department of 8th Employee: " + employee.getDepartment());
                });
//        System.out.println(found8thEmployee +" Found 8th employee");

    }

    private static void getEmployeesWithPipeAndConcatOfFullNameandLastName() {
        //Consider a list of employees, concat the fullName of all the employees with pipe (|) and return the concatenated string.
        //where fullName = firstname + lastname.
        String finalString = staticEmployeeList
                .stream()
                .map(Employee::getFullName)
                .collect(Collectors.joining(" | "));
        System.out.println(finalString +" --- value");
    }

    private static void getMaxEmployeeIdListBasedOnEmpId() {
        //Consider a list of employees, return the employee whose empId is highes
        Employee employee = staticEmployeeList
                .stream()
                .max(Comparator.comparing(Employee::getEmployeeId))
                .orElse(null);
        System.out.println("Max id employee: "+employee);
    }

    private static void getSortedEmployeesListBasedOnEmployeeLastname() {
        staticEmployeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void sortedEmpListBasedOnFirstName() {
//        Consider a list of employees, sort the employees by their firstName and return the sorted list of employees
        List<Employee> sortedList = staticEmployeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

    private static void getEmployeesWhoAreNotBelogsToGivenDept() {
        //Consider a list of employees, and if a department name is given as argument,
        // list out the employees which doesn't belong to that department.


        String givenDepartment = "Testing"; //"Devoops";

        List<Employee> employesWhosBelongsToSameDept =
                staticEmployeeList
                .stream()
//                .filter(employee -> employee.getDepartment().toLowerCase()
//                        .equals(givenDepartment.toLowerCase()))
                .filter(employee -> !employee.getDepartment().equalsIgnoreCase(givenDepartment))
                .collect(Collectors.toList());
        employesWhosBelongsToSameDept.forEach(System.out::println);
    }

    private static void addZerosIfTheGivenStringHasLessThen4digits() {
        //Store ids are of 4 digit strings.if length of given storeId is less than 4 digits,
        // you need to prefix with zeros and return a 4 digit storeId.
        List<String> stringIds = Arrays.asList("1234", "234", "32", "1");
        stringIds
                .stream()
                .forEach(id -> {
//                    (id.length() < 4) ?
//                            (id.length() == 3 ? "0"+id : (id.length() == 2 ? "00"+id : (id.length() == 1 ? "000"+id : "")))
//                            : System.out.println(id)
                    if (id.length() < 4) {
                        switch (id.length()) {
                            case 1 :
                                id = "000" +id;
                            case 2 :
                                id = "00" +id;
                            case 3 :
                                id = "0" +id;
                        }
                        System.out.println(" given less than 3 digits Id: " + id);
                        id = null;
                    }
                    System.out.println(" given with 4 digits Id: " + id);
                });

        stringIds
                .stream()
                .forEach(id -> System.out.println(String.format("%04d", Integer.parseInt(id))));
    }

    private static void getMatchingNames() {
        //Given a map with the department name as key and value as list of employees belonging to that department.
        //when a search string is given, need to list out the employees whose firstname or lastname
        // is matching(match should be case insensitive).
        staticEmployeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
               /* To display list of employees who are belongs to which department
               .forEach((s, employees) -> {
                    System.out.println(s);
                    employees.forEach(System.out::println);
                });*/
                .forEach((s, employees) -> {
                    employees
                            .stream()
                            .filter(employee -> employee.getFirstName().toLowerCase()
                                    .equals(employee.getLastName().toLowerCase()))
                            .forEach(System.out::println);
                });

        Map<String, List<Employee>> stringListMap = staticEmployeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        List<Employee> duplicateEmployeeList = stringListMap
                .values()
                .stream()
                .flatMap(List::stream)
                .filter(employee -> employee.getFirstName().toLowerCase().equals(employee.getLastName().toLowerCase()))
                .collect(Collectors.toList());
        duplicateEmployeeList.forEach(e -> System.out.println("After results "+ e));

        // Find duplicates in given object
//        stringListMap
//                .values()
//                .stream()
//                .flatMap(List::stream)
//                .forEach();
    }

    private static void getMapWithDesiredValues() {
        //Given a list of employees. Can you create a map with the count of employees each department has ?
        //with key as department name and count of employees as value.
        Map<String, Long> collect = staticEmployeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect);
    }

    private static void getFullName() {
        // From the list of employees, get the first employee from the list and return his fullName.
        //where fullName = firstname + lastname.

        staticEmployeeList
                .stream()
                .findFirst()
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
//                .orElse("Not Found")
                .ifPresent(totalName -> System.out.println("Full Name is: "+totalName));
    }
}
