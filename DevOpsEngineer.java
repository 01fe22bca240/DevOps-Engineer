class DevOpsEngineer extends Employee {

    private double bonus;

    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {

        super(name, employeeId, salary);

        this.bonus = bonus;

    }

    @Override

    public void displayDetails() {

        super.displayDetails();

        System.out.println("Bonus: $" + bonus);

        System.out.println("Total Salary: $" + (super.salary + bonus));

    }

    public static void main(String[] args) {

        // Creating an instance of Employee

        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("Kapil", 1001, 50000, 10000);

        System.out.println("\nDevOps Engineer Details:");

        devOpsEngineer.displayDetails();

    }

}