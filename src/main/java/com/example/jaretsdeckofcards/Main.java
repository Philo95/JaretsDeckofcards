package com.example.jaretsdeckofcards;

import javafx.fxml.Initializable;

import java.util.ArrayList;
import java.util.Scanner;



    public class Main {
        public static void main(String[] args) {
            //instantiated a Scanner object
            //new Scanner(System.in) is calling the "constructor" and passes in the
            //argument System.in (which is the input stream)
            Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Enter your name:");
//        String name = keyboard.nextLine();
//        System.out.printf("Hello %s%n",name);

            //let's create our first Card object
            Card aceOfSpades = new Card("ace","spades");
            Card jdubCrazyCard = new Card("7","hearts");

            System.out.println(aceOfSpades.getSuit());
            aceOfSpades.setSuit("hearts");
            System.out.println(aceOfSpades.getSuit());
            aceOfSpades.setFaceName("5");
            System.out.println(aceOfSpades.getFaceName());

            try {
                //let's put an INVALID suit in here...Armani
//            aceOfSpades.setSuit("Armani");
                aceOfSpades.setSuit("Professor");
            }catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }

            DeckOfCards deck = new DeckOfCards();

            //look at the cards in the deck by dealing them
            for (int i=1; i<=52; i++)
                System.out.println(deck.dealTopCard());


            System.out.println("~~~~~~~~shuffling the cards~~~~~~~~~");
            DeckOfCards deck2 = new DeckOfCards();
            deck2.shuffle();
            for (int i=1; i<=52; i++)
                System.out.println(deck2.dealTopCard());

            //simulate dealing 4 hands of Cards
            DeckOfCards deck3 = new DeckOfCards();
            deck3.shuffle();
            ArrayList<Card> hand1 = new ArrayList<>();
            ArrayList<Card> hand2 = new ArrayList<>();
            ArrayList<Card> hand3 = new ArrayList<>();
            ArrayList<Card> hand4 = new ArrayList<>();

            for (int i=1; i<=5; i++)
            {
                hand1.add(deck3.dealTopCard());
                hand2.add(deck3.dealTopCard());
                hand3.add(deck3.dealTopCard());
                hand4.add(deck3.dealTopCard());
            }

            System.out.println("~~~~~~~~Showing the hands of cards~~~~~~");
            for (Card card : hand1)
                System.out.println("Hand 1 card: " + card);

            for (Card card : hand2)
                System.out.println("Hand 2 card: " + card);

            for (Card card : hand3)
                System.out.println("Hand 3 card: " + card);

            for (Card card : hand4)
                System.out.println("Hand 4 card: " + card);
            CardHandViewController cc = new CardHandViewController();
            System.out.println(hand1.getClass());
            System.out.println(deck.getClass());
            System.out.println(cc.getClass());
            System.out.println(cc.getClass().getInterfaces());

            ArrayList<CardHandViewController> controllers = new ArrayList<>();
            controllers.add(cc);

        }
    }

