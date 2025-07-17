package exceptions.customException.VoteHandlingEx;

public class VoteEligible{
    public void voteValidate(int age){
        if(age<18){
            throw new ArithmeticException("Age is not less than 18 ");
        }else{
            System.out.println("You are Eligible for vote");
        }
    }

    public static void main(String[] args) throws VoteException {
        int age=20;
        VoteEligible voteEligible=new VoteEligible();
        voteEligible.voteValidate(age);
    }
}
