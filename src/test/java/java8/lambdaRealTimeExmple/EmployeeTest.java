package java8.lambdaRealTimeExmple;

import java8.utils.Employee;
import java8.lamda.lambdaRealTimeExample.BasicStreamsJava8;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {
    private final BasicStreamsJava8 employeeUtils = new BasicStreamsJava8();

    public static List<Employee> getAllEmployees() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Rajeev", "Shukla", 120, 2000,"MALE",46,true, "department"));
        employeeList.add(new Employee(2,"kumar", "Sahu", 99, 2002,"MALE",80,false, "department"));
        employeeList.add(new Employee(3,"Sanjeev", "Sethi", 180, 2000,"MALE",32,true, "department"));
        employeeList.add(new Employee(4,"Reshma", "Rao", 130, 2011,"FEMALE",26,false, "department"));
        return employeeList;
    }

    @Test public void employeeFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Ramesh");
        employee.setLastName("Sharma");

        String actual = employeeUtils.getFullName(employee);

        assertThat(actual).isEqualTo("Ramesh Sharma");
    }

    @Test
    public void getAllEmployeesCount() {

        Integer actual = employeeUtils.getAllEmployeesCount(getAllEmployees());
        assertThat(actual).isEqualTo(4);
    }

    @Test
    public void checkIsEmployeeActive() {
        Employee employee = new Employee();
        employee.setActive(true);
        Boolean actual = employeeUtils.isEmployeeActive(employee);
        assertThat(actual).isTrue();
    }

    @Test
    public void checkAgeLessThen60years() {
        Employee employee = new Employee();
        employee.setYearJoining(45);

        Boolean actual = employeeUtils.checkAgeLessThen60years(employee);

        assertThat(actual).isTrue();
    }

    @Test
    public void hasMoreThanThreeYearsAndYearOfJoiningisInbetween2000And2005() {
        Employee employee = new Employee();
        employee.setYearJoining(2002);
        employee.setAge(34);

        Boolean actual = employeeUtils.hasMoreThanThreeYearsAndYearOfJoiningisInbetween2000And2005(employee);
        assertThat(actual).isTrue();
    }
}