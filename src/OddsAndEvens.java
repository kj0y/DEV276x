import java.util.*;

public class OddsAndEvens {
    static public void main(String[] args) {
        gameSetup();
    }

    public static void gameSetup() {
        System.out.println("Let's play a game called \"Odds and Evens\"");
        Scanner inputName = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = inputName.nextLine(); //saves user input to variable 'name'
        Scanner inputChoice = new Scanner(System.in);
        System.out.print("Hi, " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choice = inputChoice.nextLine();
        if (choice.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("-------------------------------");
        System.out.println("");

        Scanner fingersInput = new Scanner(System.in);
        System.out.print("How many \"fingers\" do you put out? ");
        int userNumber = fingersInput.nextInt(); //saves user input to variable 'name'
        Random rand = new Random();
        int computerNumber = rand.nextInt(6);
        System.out.println("The computer plays " + computerNumber + " fingers.");
        System.out.println("-------------------------------");
        System.out.println("");
        int sum = userNumber + computerNumber;
        System.out.println(userNumber + " + " + computerNumber + " = " + sum);
        if (sum%2 == 0) {
            System.out.println(sum + " is ...even!");
            if (choice.equals("E")) {
                System.out.println("That means " + name + " wins! :)");
            } else {
                System.out.println("That means the computer wins!");
            }
        } else {
            System.out.println(sum + " is ...odd!");
            if (choice.equals("O")) {
                System.out.println("That means " + name + " wins! :)");
            } else {
                System.out.println("That means the computer wins!");
            }
        }
        System.out.println("-------------------------------");
        System.out.println("");
    }
}

