import java.util.*;


public class MarchThwentyFive {
    /*Problem Of The Day
    Create a record named Employee with fields: id, name, salary.
    Write a method that takes a list of Employee records and returns the total salary of
    employees earning more than 50,000.
    Use Streams for filtering and summing up salaries.

    *Test Case
    Input:
        List of Employees:
            [ Employee(1, "John", 60000), Employee(2, "Jane", 45000), Employee(3, "Alex", 70000) ]
    Output:
        Total Salary: 130000*/

    public record Employee(int id, String name, int salary) {}


    public static int retunSalary(List<Employee> employeeList){
        int sum = employeeList.stream().filter(emp -> emp.salary>50000)
                .mapToInt(emp -> emp.salary)
                .sum();

        return sum;
    }

    public void main(String[] args) {
        List<Employee> employee=List.of(
                new Employee(1, "John", 60000),
                new Employee(2, "Jane", 45000),
        new Employee(3, "Alex", 70000));

        System.out.println(retunSalary(employee));

    }

}
