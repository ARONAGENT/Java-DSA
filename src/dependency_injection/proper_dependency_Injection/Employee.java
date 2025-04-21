package dependency_injection.proper_dependency_Injection;

// Employee Entity Class
// Department class depends on Employee to show employee details
public class Employee {
    private int emp_id;
    private String emp_nm;
    private String position;
    private double salary;

    // Constructor to initialize employee data
    public Employee(int emp_id, String emp_nm, String position, double salary) {
        this.emp_id = emp_id;
        this.emp_nm = emp_nm;
        this.position = position;
        this.salary = salary;
    }

    // Method to display employee details
    public void showData() {
        System.out.println("employee Information \n.....................");
        System.out.println("Employee{" +
                "emp_id=" + emp_id +
                ", emp_nm='" + emp_nm + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}');
    }
}
