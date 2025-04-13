package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    /*

Create a Java application named PayrollCalculator that prompts the user to enter:
− their name
− their hours worked (a floating point number)
− their pay rate (a floating point number) Calculate their gross pay.
Display the employee's name and their gross pay.

(Optional)
You learned about if statements in your pre-work, so although we have not
discussed them in class, you should be able to figure out how to pay 1.5x
overtime after 40 hours.

 */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Please enter the hours you worked this week: ");
            double hoursWorked = scanner.nextDouble();

            System.out.print("Please enter your pay rate: ");
            double payRate = scanner.nextDouble();

            double grossPay;

            if (hoursWorked > 40) {
                double regularPay = 40 * payRate;
                double overtimeHours = hoursWorked - 40;
                double overtimePay = overtimeHours * payRate * 1.5;
                grossPay = regularPay + overtimePay;
            } else {
                grossPay = hoursWorked * payRate;
            }

            System.out.println("\nEmployee name: " + name);
            System.out.println("Employee gross pay: $" + String.format("%.2f", grossPay));
        }
    }


