package oops.final_classes;
// "Final class selfish hai — dusron ko inherit karne nahi deta, lekin khud kisi ko inherit kar leta hai"
public class MainClass {
    public static void main(String[] args) {
        Three obj=new Three();
        int value1=obj.addThreeNumbers(2,3,4);
        int value2= obj.addTwoNumbers(3,4);
        System.out.println("Addition of three Numbers is :"+value1);
        System.out.println("Addition of Two Numbers is :"+value2);
    }
}
