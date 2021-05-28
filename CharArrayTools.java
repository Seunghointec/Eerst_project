package be.intecbrussel.harry;

public class CharArrayTools {

    public static char[] filterAlphabet(char[] chars) {
        int i =0;
        String text = "Pr!ogr#am%m*in&g Lan?#guag(e";
        chars = text.toCharArray();
        for (i = 0; i < chars.length; i++) {
            if (chars[i] > 64 && chars[i] <= 122) //returns true if both conditions returns true
            {
             text = text+chars[i];
            }
        }
        return chars;
    }
    public static char[] sorted(char[] chars) {
        int i =0;
        String text = "Pr!ogr#am%m*in&g Lan?#guag(e";
        chars = text.toCharArray();
        for (i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                    char tmp = 0;
                    if (chars[i] > chars.length+1) {
                        tmp = chars[i];
                        chars[i] = chars[j];
                        chars[j] = tmp;
                    }
                }
            }
            return chars;
        }
}
