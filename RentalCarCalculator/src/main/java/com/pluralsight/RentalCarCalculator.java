package com.pluralsight;

import java.util.Scanner;
/*
`Scanner class to get user inputs and store vlaues base of dataType:`
- pickup date (store as a string)
- number of days for the rental
- whether they want an electronic toll tag at $3.95/day (yes/no)
- whether they want a GPS at $2.95/day (yes/no)
- whether they want roadside assistance at $3.95/day (yes/no)
- their current age

Calculate and display:

- basic car rental
- options cost
- underage driver surcharge
- total cost
The basic car rental is $29.99 per day. There is a 30% surcharge on the basic car
rental for drivers under 25. All taxes have already been incorporated into the
fees shown.

*/

public class RentalCarCalculator {

    public static void main(String[] args) {

        // we use Scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // ask for the pickup date, we will store it as text (String)
        System.out.print("Enter pickup date (MM-DD-YYYY): ");
        String pickUpDate = scanner.nextLine();

        // ask how many days they want to rent the car
        System.out.println("Enter the number of days you want to rent it: ");
        int numberOfDays = scanner.nextInt();
        scanner.nextLine(); // this line is to avoid a bug with nextLine after nextInt

        // ask if they want toll tag, store the answer as text (yes or no)
        System.out.println("Enter 'Yes' or 'No' for electronic toll tag at $3.95/day: ");
        String tollTag = scanner.nextLine();

        // ask if they want GPS
        System.out.println("Enter 'Yes' or 'No' for a GPS at $2.95/day:  ");
        String inputGPS = scanner.nextLine();

        // ask if they want roadside help
        System.out.println("Enter 'Yes' or 'No' for roadside assistance at $3.95/day: ");
        String roadsideAssistance = scanner.nextLine();

        // ask for the user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // these are the prices per day for the rental and the extras
        double basePricePerDay = 29.99;
        double tollTagPrice = 3.95;
        double gpsPrice = 2.95;
        double roadsidePrice = 3.95;

        // total price for just the car (no extras)
        double basicRentalCost = basePricePerDay * numberOfDays;

        // calculate how much extras cost depending on what user chose
        // we check if the answer is "yes", if so, we add the price * days, if not, it's $0
        double tollCost = tollTag.equalsIgnoreCase("yes") ? tollTagPrice * numberOfDays : 0;
        double gpsCost = inputGPS.equalsIgnoreCase("yes") ? gpsPrice * numberOfDays : 0;
        double roadsideCost = roadsideAssistance.equalsIgnoreCase("yes") ? roadsidePrice * numberOfDays : 0;

        // if the person is under 25, we add 30% extra to the rental cost
        double underageFee = 0;
        if (age < 25) {
            underageFee = basicRentalCost * 0.30;
        }
        // total = car + extras + underage fee
        double totalCost = basicRentalCost + tollCost + gpsCost + roadsideCost + underageFee;

        System.out.println("You're rental summary: ");
        System.out.println("Pickup Date: " + pickUpDate);
        System.out.println("Basic Rental Cost: $" + basicRentalCost);
        System.out.println("Toll Tag Cost: $" + tollCost);
        System.out.println("GPS Cost: $" + gpsCost);
        System.out.println("Roadside Assistance Cost: $" + roadsideCost);
        System.out.println("Underage Driver Fee: $" + underageFee);
        System.out.println("Total Cost: $" + totalCost);

    }
}
