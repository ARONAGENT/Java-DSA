package qspiders;

import java.util.Locale;
import java.util.Scanner;

public class ConcurrencyConvertor {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        for(;;) {
            System.out.print("Enter a Amount in INR : ");
            double amount = scanner.nextDouble();
            System.out.println("Enter the Conversion Type to be Converted: ");
            System.out.println("USD");
            System.out.println("EUR");
            System.out.println("KWD");
            System.out.println("GBP");
            System.out.println("CAD : CANADIAN DOLLOR");
            System.out.println("AUD");
            System.out.println("EGP : Egyptian Pound");
            System.out.println("RM : Malaysian Ringgit");
            System.out.print("\n Enter the Currency Type : ");
            String curr = scanner.next().toUpperCase();

            double currConv = 0;
            if (curr.equals("USD")) {
                currConv = amount / 90.76;
            }
            if (curr.equals("EUR")) {
                currConv = amount / 107.59;
            }
            if (curr.equals("KWD")) {
                currConv = amount / 296.17;
            }
            if (curr.equals("GBP")) {
                currConv = amount / 123.12;
            }
            if(curr.equals("CAD")){
                currConv = amount/ 66.5;
            }
            if(curr.equals("AUD")){
                currConv=amount/64.12;
            }
            if(curr.equals("EGP")){
                currConv=amount/1.93;
            }
            if(curr.equals("RM")){
                currConv =amount/23.26;
            }

            System.out.printf("%n%.2f INR = %.2f %s%n", amount, currConv, curr);

        }
    }
}
