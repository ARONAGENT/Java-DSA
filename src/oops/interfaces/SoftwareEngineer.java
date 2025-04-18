package oops.interfaces;

// here its allowed multiple inheritance via interfaces
public class SoftwareEngineer implements Engineer,Business {

    public void welcome(){
        System.out.println("Welcome to Software Engineer Class");
    }

    @Override
    public void basicInfo(String name, int age, String skills) {
        System.out.println("Name is : "+name);
        System.out.println("Age is :"+age);
        System.out.println("Skills are "+skills);
    }

    @Override
    public void locality(String location, String area) {
        System.out.println("Your location :"+location);
        System.out.println("Your Area is :"+area);
    }

    @Override
    public void overallBusiness(String status) {
        System.out.println("Overall Business Status is "+status);
    }
}
