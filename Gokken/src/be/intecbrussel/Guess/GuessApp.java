package be.intecbrussel.Guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessApp {
    //used static to allow access for
    static int[] randomNumbers;
    static int[] userNumbers;

    public static void main(String[] args) {
        userEntry(5);
        randomArray(5);
        comparison(5);
        System.out.println("Number of times you were correct: " + comparison.count);
    }
    //created a method that allowed user to entry number
    //created an array from those number
    public static void userEntry(int... userNumbers) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a number between 1 and 10");
        userNumbers[0] =keyboard.nextInt();
        System.out.println("here's your number1: " + userNumbers[0]);
        userNumbers[1] =keyboard.nextInt();
        System.out.println("here's your number2: " + userNumbers[1]);
        userNumbers[2] =keyboard.nextInt();
        System.out.println("here's your number3: " + userNumbers[2]);
        userNumbers[3] =keyboard.nextInt();
        System.out.println("here's your number4: " + userNumbers[3]);
        userNumbers[4] =keyboard.nextInt();
        System.out.println("here's your number5: " + userNumbers[4]);

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Human numbers = "+ Arrays.toString(userNumbers) + "\t");
        }

    //generated random numbers
    public  static void int[] randomArray(int... randomNumbers) {
        Random rand = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt((10 - 1) + 1) + 1;
            System.out.println("Computer numbers = "+ Arrays.toString(randomNumbers) + "\t");
        }
    }
    //try to compare to two array
    public static int comparison(int... userNumbers, int... randomNumbers) {
        int count =0;
        if (userNumbers == randomNumbers) {
            count++;
        }else {
        }
        return count;
    }
}

/*
            } else {
                System.out.println("you got it!");
                guessed = true;
            }
            count++;
        }
    }
        int count=0;
        boolean guessed =false;
        while(!guessed) {

        if (count++>5) {
            System.out.println("too many times");
            break
        }
    }
}*/
