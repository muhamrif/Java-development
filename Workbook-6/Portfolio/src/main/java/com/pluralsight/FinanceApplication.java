package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.Scanner;

public class FinanceApplication {
     public static Portfolio port = new Portfolio("yearup", "Hamza");
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("pam","123", 12500);
        BankAccount acc2 = new BankAccount("Gary", "456", 1500);
        FixedAsset bling  = new Jewelry( "chain",420,15);


//        acc1.deposit(5000);
//        acc2.getValue();
////        acc2.getValue();
//
//        System.out.println(acc1.getValue());
//        System.out.println(acc2.getValue());
//        System.out.println(bling.getValue());



        port.add(acc1);
        port.add(acc2);
        port.add(bling);

        System.out.println(port.getMostValuable());
        System.out.println(port.getLeastValuable());
        System.out.println(port.getValue());

    }

    public void displayMenu(){
        Scanner input = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            String num = input.nextLine() ;
            switch (num){
                case "a":
                    System.out.println();
                    break;
                case "m":
                    System.out.println("");
                    break;
                case "l":
                    System.out.println("");
                    break;
                case "x":
                    flag= false;
                    System.out.println("");
                    break;
                default:
                    System.out.println("u rich");
            }
        }
    }
}
