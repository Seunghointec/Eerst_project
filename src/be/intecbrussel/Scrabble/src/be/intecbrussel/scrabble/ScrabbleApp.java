package be.intecbrussel.scrabble;
import java.util.Scanner;

public class ScrabbleApp {
    int score =0;
    static String word;


    public static void main(String[] args) {
    //use the scanner to get score for a word
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your word");
        word = keyboard.nextLine();
        System.out.println("This is your score " + computeScore(word));
    }


    //Create a method to compute score for a letter value
    public int computeScore(String word)  {
        //we are creating array of characters from your words
        char[] arrayWord = word.toCharArray();

        //By looping through all the characters in an array
        for (int i = 0; i < arrayWord.length; i++) {
            //If certain character are found, that character will be given a score based on their value
            if (arrayWord[i] == 'q' || arrayWord[i] == 'z') {
                score += 10;
            }
            if (arrayWord[i] == 'j' || arrayWord[i] == 'x') {
                score += 8;
            }
            if (arrayWord[i] == 'k') {
                score += 5;
            }
            if (arrayWord[i] == 'f' || arrayWord[i] == 'h' || arrayWord[i] == 'v' || arrayWord[i] == 'w'
                    || arrayWord[i] == 'y') {
                score += 4;
            }
            if (arrayWord[i] == 'b' || arrayWord[i] == 'c' || arrayWord[i] == 'm' || arrayWord[i] == 'p') {
                score += 3;
            }
            if (arrayWord[i] == 'd' || arrayWord[i] == 'g') {
                score += 2;
            }
            if (arrayWord[i] == 'a' || arrayWord[i] == 'e' || arrayWord[i] == 'i' || arrayWord[i] == 'o'
                    || arrayWord[i] == 'u' || arrayWord[i] == 'l' || arrayWord[i] == 'n' || arrayWord[i] == 'r'
                    || arrayWord[i] == 's' || arrayWord[i] == 't') {
                score += 1;
            }
            //those scores will be added and returned to the main method.
        }
        return score;
    }
}