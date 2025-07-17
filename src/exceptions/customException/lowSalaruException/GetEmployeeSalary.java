package exceptions.customException.lowSalaruException;

import java.util.Scanner;

public class GetEmployeeSalary {
    public static void main(String[] args) throws LowSalaryException {
        Scanner scanner=new Scanner(System.in);
        double salary= scanner.nextDouble();
        try {
            if (salary < 10000) {
                throw new LowSalaryException("Salary is Less than 10000");
            } else {
                System.out.println("Your Salary is :" + salary);
            }
        }catch (LowSalaryException lowSalaryException){
            System.out.println(lowSalaryException);
        }
    }
}
