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
            float root = 5.0f;

    }
}
