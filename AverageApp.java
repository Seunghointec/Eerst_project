import com.sun.security.jgss.GSSUtil;

public class AverageApp {

    public static int average(int... values) {
        //...to make the method accept a variable amount of (in this case) int parameter.
        //To handle this variable amount of variables you can access it like an array.

        int total =0;
        for (int el : values) {
            total += el;
        }
        int avg =0;
        if (values.length != 0) {
            avg = total / values.length;
        }
        return avg;
    }
    public static void main (String[]args){
        System.out.println(average(4,7,9));
        System.out.println(average());
        int [] values = {3,8,6,7,6};
        System.out.println(average(values));
        }
    }
