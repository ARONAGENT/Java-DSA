package oops.interfaces;

public class DataAnalyst implements Engineer{
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
}
