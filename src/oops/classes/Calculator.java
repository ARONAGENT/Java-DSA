package oops.classes;

public class Calculator {
    private int result;
    public String Desc;
    public void calcSquare(int a,int b,String Desc){
        result=a+b;
//        this.Desc=Desc;
        System.out.println("Sum is "+result);
        System.out.println("Your Public Data :"+Desc);
    }
}
