package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {


            // Question 1:
            int bobSalary= 56 ;
            int garySalary= 55 ;
            int highestSalary = Math.max(bobSalary, garySalary);
            System.out.println("The highest salary is: " + highestSalary + " dabloons" );


            //Question 2:
            int carPrice = 32;
            int truckPrice = 45;
            System.out.println("cheaper is car which is priced at: $" + Math.min(carPrice,truckPrice));

            //Question 3:
            float radius = 7.25f;
            System.out.println( "area of the circle is: " + 3.14 * Math.pow(7.25, 2));

            //Question 4:
            int root = 5;
            System.out.println("Square root of 5 is: " + Math.sqrt(root));

            //Question 5:
            int x1 = 5;
            int y1 = 10;

            int x2 = 85;
            int y2 = 50;

            System.out.println("Distance between point A and point B is: " + Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));
            // ^^ returning a float for some reason.

            //Question 6:
            float value = -3.8f;
            System.out.println("Absolute value of -3.8 is: " + Math.abs(value));

            //Question 7:
            //Randomizer
            System.out.println("This number will always be less than 1 and more than 0: " + Math.random());
    }
}
