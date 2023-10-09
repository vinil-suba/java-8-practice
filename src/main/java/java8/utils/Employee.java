package java8.utils;

import java.util.Optional;

public class Employee {

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", yearJoining=" + yearJoining +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                ", department='" + department + '\'' +
                '}';
    }

    private Integer employeeId;
    private String firstName;
    private String lastName;

    /*public Optional<Double> getSalary() {
        return Optional.ofNullable(salary);
    }*/

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;
    private Integer yearJoining;
    private String gender;
    private Integer age;
    private Boolean isActive;
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Employee(Integer employeeId, String firstName, String lastName, double salary, Integer yearOfjoining, String gender, Integer age, Boolean isActive, String department) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.yearJoining = yearOfjoining;
        this.gender = gender;
        this.age = age;
        this.isActive = isActive;
        this.department = department;
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }
    public Employee(){}

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYearJoining() {
        return yearJoining;
    }

    public void setYearJoining(Integer yearJoining) {
        this.yearJoining = yearJoining;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
