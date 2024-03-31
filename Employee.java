public class Employee {

    public String name;

    public int employeeId;

    public double salary;

    public Employee(String name, int employeeId, double salary) {

        this.name = name;

        this.employeeId = employeeId;

        this.salary = salary;

    }

    public void displayDetails() {

        System.out.println("Employee Name: " + name);

        System.out.println("Employee ID: " + employeeId);

        System.out.println("Salary: $" + salary);

    }

    public static void main(String[] args) {

        // Creating an instance of Employee

        Employee employee = new Employee("Kapil", 1001, 50000);

        System.out.println("Employee Details:");

        employee.displayDetails();

    }

}