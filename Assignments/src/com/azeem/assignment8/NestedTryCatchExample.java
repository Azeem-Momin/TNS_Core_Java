package com.azeem.assignment8;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            String input1 = scanner.nextLine();
            System.out.print("Enter the second number: ");
            String input2 = scanner.nextLine();

            // Using null checks to simulate NullPointerException
            if (input1 == null || input2 == null) {
                throw new NullPointerException("One of the inputs is null.");
            }

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            try {
                int result = divideNumbers(num1, num2);
                System.out.println("The result of division is: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter valid integers.");
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int divideNumbers(int num1, int num2) {
        return num1 / num2;
    }
}

