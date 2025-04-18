package oops.interfaces.programs;

import oops.interfaces.DataAnalyst;
import oops.interfaces.SoftwareEngineer;

public class RunnableProgram {
    public static void main(String[] args) {
        DataAnalyst analyst=new DataAnalyst();
        // it is a interface method interface name -> Engineer
        analyst.basicInfo("Rahul",21,"Python and Power BI");
        analyst.locality("London","westSide");
        SoftwareEngineer softwareEngineer=new SoftwareEngineer();
        // it is a software engineer class method ->
        softwareEngineer.welcome();
        // it is a interface method interface name -> Engineer
        softwareEngineer.basicInfo("Rohan",20,"Java and Spring Boot");
        softwareEngineer.locality("Berlin","North");
        // it is a interface method interface name -> Business
        softwareEngineer.overallBusiness("Fine");

    }
}
