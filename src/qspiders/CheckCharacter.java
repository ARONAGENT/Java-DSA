package qspiders;

import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Character :");
        char ch =  scanner.next().charAt(0);

        String result = ((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
                ?((ch>=65 && ch<=90) ? (ch+" is a UpperCase"):(ch+ "is a Lowecase")):
                ((ch>=48 && ch<=57) ? (ch+" is a Digit "):(ch+" is a Special Character"));

        System.out.println(result);

    }
}
