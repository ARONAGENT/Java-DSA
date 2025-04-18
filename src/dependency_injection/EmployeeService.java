package dependency_injection;

public class EmployeeService implements createAccount{
    @Override
    public void createAcc(int accNo, String accNm, String accType) {
        System.out.println("Employee Account Service ...................");
        System.out.println("Account Number :"+accNo);
        System.out.println("Account Name   :"+accNm);
        System.out.println("Account Type   :"+accType);
    }
}
