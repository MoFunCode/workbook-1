package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

/*
    Create a Java application named BasicCalculator that reads in two floating point
    numbers and then asks the user whether they want to add, subtract, multiply or
    divide the two numbers.
    For this exercise, only code the questions. We won’t actually calculate add,
    subtract, multiply or divide. For this exercise, always multiply.
    Step 1
    Perform the requested operation and display the results.
    Enter the first number: 5
    Enter the second number: 12
    Possible calculations:
            (A)dd
            (S)ubtract
(M)ultiply
            (D)ivide
    Please select an option: M
5 * 12 = 60
*/
    public static void main(String[] args) {

        System.out.println("Enter your first number: ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();

        System.out.println("Enter your second number: ");
        Scanner scanner = new Scanner(System.in);
        int number2 = scanner.nextInt();


        int calculationTotal = number1 * number2;
        System.out.println("Your total is: " + calculationTotal);


































    }


}
