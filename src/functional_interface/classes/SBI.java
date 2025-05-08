package functional_interface.classes;

import functional_interface.interfaces.Banking;

public class SBI implements Banking {
    @Override
    public String calInterest(double balance) {
        double interest=balance*5/100;
        return "Interest of Sbi Bank For balance :"+balance+" is "+interest;
    }
}
