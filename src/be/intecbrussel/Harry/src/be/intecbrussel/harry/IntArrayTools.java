package be.intecbrussel.harry;

import java.util.Arrays;

public class IntArrayTools {
    static int i =0;
    static int[] array = new int[i];

    public static boolean isSorted(int[] values, boolean isGoingUp) {

        isGoingUp = true;

        for (i = 0; i < values.length-1; i++) {
            //if the value of the smallest index is smaller than the next index
            if (values[i] < values[i]+1) {
                //biggest = values[i]; // new maximum
                isGoingUp = true;

            } else {
                isGoingUp =false;   // new minimum
            }
        }
        return isGoingUp;
    }
    public static int[] sorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp = 0;
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
    public static boolean chopSearch(int[] array, int value) {
        Arrays.sort(array);
        boolean isPresent = true;
        for (int element : array) {
            if (element == value) {
                isPresent = true;
            }else {
                isPresent =false;
            }
        }
        return isPresent;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,23};
        chopSearch(array, 7);
        sorted(array);
        System.out.println(isSorted(array, false));
        System.out.println(chopSearch(array, 7));
        System.out.println(Arrays.toString(sorted(array)));
    }
}
