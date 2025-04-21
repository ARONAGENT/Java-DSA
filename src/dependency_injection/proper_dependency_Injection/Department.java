package dependency_injection.proper_dependency_Injection;

public class Department {
    private int dept_id;
    private String dept_name;

    // Employee is a dependency of Department
    private Employee employee;

    // Constructor Injection: we are injecting employee dependency from outside
    // Not creating object inside — this is proper dependency injection
    public Department(int dept_id, String dept_name, Employee employee) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.employee = employee;
    }

    // This method uses the injected employee object to display data
    public void showDeptDetails() {
        System.out.println("dept_id :" + dept_id);
        System.out.println("dept_name :" + dept_name);
        System.out.println("employee :");
        employee.showData(); // using employee's method to show details
    }
}
