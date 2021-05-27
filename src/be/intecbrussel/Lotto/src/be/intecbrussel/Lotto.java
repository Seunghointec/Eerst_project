package be.intecbrussel;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    static int lotto1;
    static int lotto2;
    static int lotto3;
    static int lotto4;
    static int lotto5;
    static int lotto6;

    public static int[] randomNumber(int [] array) {
        // generate random int value between 1 and 45
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(44) + 1;
            //print 6 random numbers
            System.out.println(array[i]);
        }
        return array;
    }

    public static int noNumberDuplicates(int lotto1, int lotto2, int lotto3, int lotto4, int lotto5) {
        boolean noDuplicate = false;
        int numbers =0;
        Random rand = new Random();
        while (!noDuplicate) {
            numbers = rand.nextInt(44)+1;
            if (numbers == lotto1 || numbers == Lotto.lotto2 || numbers == Lotto.lotto3
                    || numbers == Lotto.lotto4 || numbers == Lotto.lotto5 || numbers == Lotto.lotto6) {
                noDuplicate = false;
            } else {
                noDuplicate = true;
            }
        }
        return numbers;
    }
    public static void printMyLotto() {
        Lotto.lotto1 = Lotto.noNumberDuplicates(Lotto.lotto2,Lotto.lotto3,Lotto.lotto4,Lotto.lotto5,Lotto.lotto6);
        Lotto.lotto2 = Lotto.noNumberDuplicates(Lotto.lotto1,Lotto.lotto3,Lotto.lotto4,Lotto.lotto5,Lotto.lotto6);
        Lotto.lotto3 = Lotto.noNumberDuplicates(Lotto.lotto2,Lotto.lotto1,Lotto.lotto4,Lotto.lotto5,Lotto.lotto6);
        Lotto.lotto4 = Lotto.noNumberDuplicates(Lotto.lotto2,Lotto.lotto3,Lotto.lotto1,Lotto.lotto5,Lotto.lotto6);
        Lotto.lotto5 = Lotto.noNumberDuplicates(Lotto.lotto2,Lotto.lotto3,Lotto.lotto4,Lotto.lotto1,Lotto.lotto6);
        Lotto.lotto6 = Lotto.noNumberDuplicates(Lotto.lotto2,Lotto.lotto3,Lotto.lotto4,Lotto.lotto5,Lotto.lotto1);

        int [] lottoNumbers = {lotto1, lotto2, lotto3,lotto4, lotto5, lotto6};
        Arrays.sort(lottoNumbers);
        System.out.println(Arrays.toString(lottoNumbers));
    }

}


