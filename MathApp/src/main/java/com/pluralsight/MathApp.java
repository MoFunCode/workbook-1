package com.pluralsight;
/*
2. Find and display the smallest of two variables named carPrice and
truckPrice. Set the variables to any value you want.
3. Find and display the area of a circle whose radius is 7.25
4. Find and display the square root a variable after it is set to 5.0
5. Find and display the distance between the points (5, 10) and (85, 50)
6. Find and display the absolute (positive) value of a variable after it is set to -3.8
7. Find and display a random number between 0 and 1
* */

public class MathApp {


  public static void main(String[] args) {

    /*  1. Create two variables to represent the salary for Bob and Gary, name them
    bobSalary and garySalary. Create a new variable named
    highestSalary. Determine whose salary is greater using Math.max() and
    store the answer in highestSalary.*/
    double bobSalary = 500000;
    double garySalary = 12500.95;

    double highestSalary = Math.max(bobSalary, garySalary);
    System.out.println("The highest salary is: " + highestSalary);

   /*    2. Find and display the smallest of two variables named carPrice and
    truckPrice. Set the variables to any value you want.*/

    int carPrice = 25000;
    double truckPrice = 23000;

    double smallest = Math.min(carPrice, truckPrice);
    System.out.println("The smallest price between the Truck and Car is: " + smallest);


    /*This creates an instance of the MathApp class and uses the reference variable 'circle'
    to call the areaOfCircle method and print the result.*/
    MathApp circle = new MathApp();
    circle.areaOfCircle();


    MathApp squreRoot = new MathApp();
    squreRoot.squareRootOfFive();


  }

  public void areaOfCircle(){
   // Formula to find the area of a circle is: A = Pi * r^2

   double radius = 7.25;
   double area = Math.PI * Math.pow(radius, 2);
   System.out.println("The area of the circle is: " + area);

 }

 //4. Find and display the square root a variable after it is set to 5.0
 public void squareRootOfFive(){

    double number = 5.0;
    double squreRoot = Math.sqrt(number);

   System.out.println("The squre root of 5 is: " + squreRoot);

 }

 //5. Find and display the distance between the points (5, 10) and (85, 50)

  public void distanceDifference(){




  }



}

