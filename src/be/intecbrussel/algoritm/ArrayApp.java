package be.intecbrussel.algoritm;


import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class ArrayApp {

    public static void main(String[] args) {
        int[] numbers;

        numbers = new int[]{7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98, 105, 112, 119, 126, 133, 140};

        for (int n: numbers) {
            System.out.println(n);
        }
        for (int n= numbers.length-1; n>=0; n--) {
        System.out.println(numbers[n] + "");
        }
        //assignment 3
        int [][] array2d = new int [4][6];
        Random rand = new Random();
            for(int row=0; row<4; row++) {
                for(int el=0; el<6 ; el++) {
                    array2d [row][el] = rand.nextInt(20);
                    System.out.println(array2d[row][el] +"\t");
                }
                System.out.println("\n");
            }
        }
    }









    

