import java.util.*;

public class Crypto {
    static public void main(String[] args) {
        System.out.println(normalizeText("This is some \"really\" great. (Text)!?"));
        System.out.println(Ceasarify("abc", 3));
    }

    // Part 1 - Normalize Text
    public static String normalizeText(String s) {
        String normalizedString = s.replaceAll("[^\\p{L}\\p{N}]", "").toUpperCase();
        return normalizedString;
    }

    // Part 2 - Ceasar Cipher
    public static String Ceasarify(String message, int key) {
        String s = "";
        int len = message.length();
        for (int x = 0; x < len; x++) {
            char c = (char) (message.charAt(x) + key);
            if (c > 'z')
                s += (char) (message.charAt(x) - (26 - key));
            else
                s += (char) (message.charAt(x) + key);
        }
        return s;
    }

    // Part 3 - Codegroups
    public static String Codegroups(String encryptedMsg, int numLettersPerGrp) {
        String x = "";
        return x;
    }

}
