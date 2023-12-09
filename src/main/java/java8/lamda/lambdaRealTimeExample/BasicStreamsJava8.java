package java8.lamda.lambdaRealTimeExample;

import java8.utils.Employee;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BasicStreamsJava8 {
    /*
    * Function --> Input and Output
    * Predicate --> outPut boolean
    * Consumer --> only Input
    * Supplier --> only Output
    * */


    public String getFullName(Employee employee) {
        // Function will take argument return the argument.
        //in this case employee is the input and fullName is the output
        Function<Employee, String> fullName = e -> e.getFirstName() + " " + e.getLastName();
        return fullName.apply(employee);
    }

    public int getAllEmployeesCount(List<Employee> empList) {
        Supplier<Integer> employesCount = empList::size;
       return employesCount.get();
    }

    public Boolean isEmployeeActive(Employee employee) {
        Predicate<Employee> isEmployeeActive = e -> e.getActive().equals(true);
        return isEmployeeActive.test(employee);
    }

    public boolean checkAgeLessThen60years(Employee employee) {
        Predicate<Employee> employedLongerThanFiveYears = emp -> emp.getYearJoining() <= 60;
        return employedLongerThanFiveYears.test(employee);
    }

    public boolean hasMoreThanThreeYearsAndYearOfJoiningisInbetween2000And2005(Employee employee) {
        Predicate<Employee> moreThanThreeDirectReports = emp -> emp.getYearJoining() > 2000 && emp.getAge() <= 60;
        return moreThanThreeDirectReports.test(employee);
    }

}