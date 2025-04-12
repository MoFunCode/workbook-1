package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    /*

Create a Java application named PayrollCalculator that prompts the user to enter:
− their name
− their hours worked (a floating point number)
− their pay rate (a floating point number) Calculate their gross pay.
Display the employee's name and their gross pay.

 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the hours you worked this week: ");
        double hoursWorked = scanner.nextDouble();

        System.out.println("Please enter your pay rate: ");
        double payRate = scanner.nextDouble();

        double grossPay = payRate * hoursWorked;

        System.out.println("Employee name: " + name);
        System.out.println("Employee gross pay: $" + String.format("%.2f", grossPay));


    }
}
