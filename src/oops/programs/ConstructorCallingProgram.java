package oops.programs;

import oops.classes.ConstructorCalling;
import oops.classes.ParameterizedConstructor;

public class ConstructorCallingProgram {
    public static void main(String[] args) {
        ConstructorCalling constructorCalling=new ConstructorCalling();
        constructorCalling.yourSelf("Rohan","A-5 Street Sai nagar Amt");
        ParameterizedConstructor parameterizedConstructor= new ParameterizedConstructor("Rohan");
        parameterizedConstructor.addition(45,78);
    }
}
