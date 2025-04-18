package dependency_injection;

import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeService();
        StakeHoldersService stakeHoldersService=new StakeHoldersService();
        AddAccountToDepartment account=new AddAccountToDepartment(employeeService,stakeHoldersService);

        account.doneEmpAcc(1002,"Rahul","fixed");
        account.doneStakeHoldersAccount(1003,"Rohan","PPF");
    }
}
