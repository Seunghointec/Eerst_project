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


    //Create a method
    public int computeScore(String word)  {
        char[] arrayWord = word.toCharArray();

        for (int i = 0; i < arrayWord.length; i++) {
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
        }
        return score;
    }
}