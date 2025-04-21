package dependency_injection.proper_dependency_Injection;
//🔁 Final Summary (in your tone):
//Yahan Department ko Employee ki zarurat hai — lekin wo khud object nahi banata.
//Hum employee object ko constructor ke through inject karte hain — Dependency Injection ka perfect use!
//Isse code testable, flexible aur loosely coupled ban jata hai 💡
public class CreateNewEmpAndDept {
    public static void main(String[] args) {
        // Step 1: Create a new Employee object with required data
        // This object will act as a dependency for the Department class
        Employee employee = new Employee(1, "Rohan", "Backend Developer", 78000.00);

        // Step 2: Create a Department object
        // Instead of creating Employee inside Department, we are passing it (injecting it) from outside
        // This is called **Dependency Injection** — providing dependency from outside the class
        Department department = new Department(1, "Developers", employee);

        // Step 3: Call showDeptDetails(), which internally uses employee.showData()
        // So, Department depends on Employee — and we're injecting that dependency
        department.showDeptDetails();
    }
}

