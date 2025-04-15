package com.pluralsight;

import java.util.Scanner;

/*
Prompt the user for the size of the sandwich (1 or 2)

- 1: Regular: base price $5.45
- 2: Large: base price $8.95
Prompt the user for their age:
- Student (17 years old or younger) — receive a 10% discount
- Seniors (65 years old or older) — receive a 20% discount

Display the cost of the sandwich to the screen
* */
public class SandwichShop {

    public static void main(String[] args) {
        //Prompt the user for the size of the sandwich (1 or 2)
        Scanner scanner = new Scanner(System.in);

       /* - 1: Regular: base price $5.45
                - 2: Large: base price $8.95*/
        System.out.println("Please select your Sandwich type: ");
        System.out.println("1. Regular - $5.45");
        System.out.println("2. Special - $8.95");
        System.out.println("Enter 1 or 2: ");
        //this accepts an integer from the user and store our input to our variable 'size'
        int size = scanner.nextInt();

        double price = 0.0;
        if (size == 1) {
            price = 5.45;
            System.out.println("You selected one bro: ");
        } else if (size == 2) {
            price = 8.95;
            System.out.println("you selected two bro");
        } else {
            System.out.println("sorry bro ;( Please try again, you did not select an option from 1 or 2");

        }
     /*   Prompt the user for their age:
        - Student (17 years old or younger) — receive a 10% discount
                - Seniors (65 years old or older) — receive a 20% discount */
        System.out.println("Now please enter your age: ");
        int age = scanner.nextInt();
        double discount = 0;

        if (age <= 17) {
            discount = 0.10;
            System.out.println("You still got a long way to go in life young man, be humble");
        } else if (age >= 65) {
            discount = 0.20;
            System.out.println("You been working hard, please get some rest and enjoy your life old man");
        } else if (age == 0) {
            System.out.println("Sheeeesh you're not born yet ahhahah relax please");
        } else {
            System.out.println("Unfortunately you're not eligible for a discount until your 65");
        }

        double finalPrice = price - (price * discount);
        System.out.println("Your final price is: " + finalPrice);

    }
}



