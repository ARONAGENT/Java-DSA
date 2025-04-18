package dependency_injection;

public class AddAccountToDepartment {
    EmployeeService employeeService;
    StakeHoldersService stakeHoldersService;
    public AddAccountToDepartment(EmployeeService employeeService,StakeHoldersService stakeHoldersService) {
        this.employeeService = employeeService;
        this.stakeHoldersService=stakeHoldersService;
    }

    public void doneEmpAcc(int accNo,String accNm,String accType){
        employeeService.createAcc(accNo,accNm,accType);
    }

    public void doneStakeHoldersAccount(int accNo,String accNm,String accType){
        stakeHoldersService.createAcc(accNo,accNm,accType);
    }
}
