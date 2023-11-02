package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Deck deck = new Deck();
        deck.shuffle();
        Card p1card1 = deck.deal();
        Card p1card2 = deck.deal();
        Card p2card1 = deck.deal();
        Card p2card2 = deck.deal();

        String winner = "";
        System.out.println("p1:");
        String player1Name = input.nextLine();

        System.out.println("p2:");
        String player2Name = input.nextLine();

        int p1Points =0;
        int p2Points =0;

        Hand p1Hand = new Hand();
        Hand p2Hand = new Hand();

        p1Hand.Deal(p1card1);
        p1Hand.Deal(p1card2);
        p1Points = p1Hand.getValue();
        System.out.println("\n"+"P1 cards:");
        System.out.println(p1card1);
        System.out.println(p1card2);
        System.out.println("P1 Total: " + p1Points + "\n");

        p2Hand.Deal(p2card1);
        p2Hand.Deal(p2card2);
        p2Points = p2Hand.getValue();
        System.out.println("P2 cards:");
        System.out.println(p2card1);
        System.out.println(p2card2);
        System.out.println("P2 Total: " + p2Points);


        int p1diff= 21-p1Points;
        int p2diff = 21-p2Points;

    if (p1Points>21 || p1diff>p2diff) {
        winner += player2Name;
    }else if (p2Points>21 || p1diff<p2diff){
        winner+=player1Name;
    } else if (p1Points==p2Points) {
        winner+="Draw";
    }

        System.out.println("winner:");
        System.out.println(winner.toUpperCase());

    }
}
