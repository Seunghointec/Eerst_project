package be.intecbrussel;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;

public class LottApp {

    public static void main(String[] args) {
       int[] array = new int[6];
        Arrays.sort(array);
        Lotto.randomNumber(array);
        //System.out.println(Lotto.lotto2);
        Lotto.printMyLotto();
    }
}
 /*


         System.out.println("number 1: " + Lotto.lotto1);
         System.out.println("number 2: " + Lotto.lotto2);
         System.out.println("number 3: " + Lotto.lotto3);
         System.out.println("number 4: " + Lotto.lotto4);
         System.out.println("number 5: " + Lotto.lotto5);
         System.out.println("number 6: " + Lotto.lotto6);*/