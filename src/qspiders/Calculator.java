package qspiders;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            for (; ; ) {

                System.out.println("\n===== Simple Calculator =====");

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                System.out.println("Choose operation (+, -, *, /) or type 'exit' to quit:");
                String operator = sc.next();

                // Exit condition
                if (operator.equalsIgnoreCase("exit")) {
                    System.out.println("Calculator Closed.");
                    break;
                }

                double result;

                if (operator.equals("+")) {
                    result = num1 + num2;
                    System.out.println("Result: " + result);

                } else if (operator.equals("-")) {
                    result = num1 - num2;
                    System.out.println("Result: " + result);

                } else if (operator.equals("*")) {
                    result = num1 * num2;
                    System.out.println("Result: " + result);

                } else if (operator.equals("/")) {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error! Division by zero not allowed.");
                    }

                } else {
                    System.out.println("Invalid operator!");
                }
            }


        }
}
