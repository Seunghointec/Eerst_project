package be.intecbrussel.Guess;

import java.util.Random;
import java.util.Scanner;

public class Guess{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        int pick;
        int rantInt = 0;
        int tries = 0;
        boolean found = false;

        while(true) {

            System.out.println("Please pick a number between 1 - 10: ");
            pick = Integer.parseInt(reader.nextLine());

            if(pick > 10){
                System.out.println("Oops, number too big! Please try again!\n");

            }
            else {
                System.out.println("Let's see if I can get the same number too!");


                break;}

        }

        while(!found){
            rantInt = rand.nextInt((10 - 1) + 1) + 1; // Genrating number between 1 - 10
            tries++;
            if(pick == rantInt && tries <=5){
                found = true;
            }
            else if (tries >=6) {
                found = false;
                break;
            }
        }
        System.out.println("Your number is " + rantInt + " and I found it in " + tries + " tries");




    }
}