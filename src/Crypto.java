import java.awt.*;
import java.util.*;

public class Crypto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter message to encrypt: ");
        String message = input.nextLine();

        //Part 1 - Normalize Text
        System.out.println(message = normalizeText(message));

        //Part 2 - Caesar Cipher
        System.out.print("Enter shift value: ");
        int key = input.nextInt();
        String caesarfiedText = caesarify(message, key);
        System.out.println(caesarify(message, key));

        //Part 3 - Code Groups
        System.out.print("Enter size to make code groups: ");
        int numLettersPerGrp = input.nextInt();
        String groupifiedText = groupify(caesarfiedText, numLettersPerGrp);

        //Part 4 - Putting it all together
        System.out.println("Encrypting string... ");
        String encryptString = encryptString(message, key, numLettersPerGrp);
        System.out.println(encryptString);
    }

    // Part 1 - Normalize Text
    public static String normalizeText(String message) {
        String normalizedText = message.replaceAll("[^a-zA-Z ]", "")
                .replaceAll("\\s+","").toUpperCase();
        return normalizedText;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    // Part 2 - Caesar Cipher
    public static String caesarify(String message, int key) {
        String caesarfiedText = "";
        int len = message.length();
        for (int x = 0; x < len; x++) {
            char c = (char) (message.charAt(x) + key);
            if (c > 'z')
                caesarfiedText += (char) (message.charAt(x) - (26 - key));
            else
                caesarfiedText += (char) (message.charAt(x) + key);
        }
        return caesarfiedText;
    }

    // Part 3 - Groupify
    public static String groupify(String caesarfiedText, int numLettersPerGrp) {
        // Create a new string
        String groupifiedText = new String();

        for (int i = 0; i < caesarfiedText.length(); i++) {
            // while the grouped message doesn't have the same length as the encrypted message
            while ((groupifiedText.replace(" ", "").replace("x", "").length()) != caesarfiedText.length()) {
                // If it's the first letter of the string
                if (i == 0) {
                    groupifiedText += caesarfiedText.charAt(i);
                    i++;
                    // Else if we've reached the group length, add a letter and a space
                } else if ((i + 1) % numLettersPerGrp == 0) {
                    // Insert a letter & space
                    groupifiedText += caesarfiedText.charAt(i);
                    groupifiedText += " ";
                    i++;
                } else {
                    groupifiedText += caesarfiedText.charAt(i);
                    i++;
                }
            }

            // If we have reached the end of the string and are at the group length
            if ((groupifiedText.replace(" ", "").length()) == caesarfiedText.length()) {
                while (i % numLettersPerGrp != 0) {
                    groupifiedText += "x";
                    i++;
                }
            break;
            }
        }
        return groupifiedText;
    }

    // Part 4 - Putting it all together
    public static String encryptString(String message, int key, int numLettersPerGrp) {
        return groupify(caesarify(normalizeText(message) ,key),numLettersPerGrp);
    }
}