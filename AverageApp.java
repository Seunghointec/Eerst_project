
import java.util.Arrays;

public class AverageApp {

    // Recalling average method
    public static void main(String[] args) {
        int[] values = {3, 8, 6, 7, 6};
        System.out.println(average(values));
        System.out.println(min(values));
        System.out.println(max(values));
    }
    // start with the first value
    public static int max(int... values) {
        int maximum = 0;
        Arrays.sort(values);

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maximum) {
                maximum = values[i];   // new maximum
            }
        }
        return maximum;
    }//end method max

    public static int min(int... values) {
        int minimum = 0;
        Arrays.sort(values);

        for (int i = 1; i < values.length; i++) {
            if (values[i] < minimum) {
                minimum = values[i];   // new minimum
            }
        }
        return minimum;
    }//end method min

    //parameter, we use is the number of value from the array
    public static int average(int... values) {
        //...to make the method accept a variable amount of (in this case) int parameter.
        //To handle this variable amount of variables you can access it like an array.

        int total = 0;
        for (int el : values) {
            //to get total number from all numbers from array
            total += el;
        }
        int avg = 0;
        if (values.length != 0) {
            //values.length will count all the numbers that are present in the array
            avg = total / values.length;
        }
        //return the average of the array
        return avg;
    }
}
