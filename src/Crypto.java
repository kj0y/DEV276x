import java.util.*;

public class Crypto {
    static public void main(String[] args) {
        normalizeText("This is some \"really\" great. (Text)!?");
    }

    public static char normalizeText(String s) {
        char c = 0;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
        }
        return c;
    }
}