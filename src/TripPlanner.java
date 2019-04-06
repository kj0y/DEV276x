import java.util.Scanner;
import java.math.*;

public class TripPlanner {
    public static void main(String[] args) {
        vacationInfo();
        tripData();
        timeDifference();
        areaConversion();
    }
        // Part 1
        public static void vacationInfo() {
            Scanner input = new Scanner(System.in); //create variable
            System.out.println("Welcome to Vacation Planner!");
            System.out.print("What is your name? ");
            String name = input.nextLine(); //saves user input to variable 'name'
            System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
            String location = input.nextLine(); //saves user input to variable 'location'
            System.out.println("Great! " + location + " sounds like a great trip.");
            System.out.println("**********");
            System.out.println();
            System.out.println();
        }
        // Part 2
        public static void tripData() {
            Scanner input = new Scanner(System.in); //create variable
            Scanner bdinput = new Scanner(System.in); //create BigDecimal scanner
            System.out.print("How many days are you going to spend travelling? ");
            int days = input.nextInt();
            System.out.print("How much money, in USD, are you planning to spend on your trip? ");
            BigDecimal money = bdinput.nextBigDecimal();
            System.out.print("What is the three letter currency symbol for your travel destination? ");
            String currSymbol = input.next();
            System.out.print("How many " + currSymbol + " are there in 1 USD? ");
            double conversion = input.nextDouble();
            System.out.println();
            System.out.println();

            System.out.println("If you are travelling for " + days + " days that is the same as " + days*24 + " hours or " + days*24*60 + " minutes.");
            //days = days.multiply(new BigDecimal(money));
            System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + money.divide(BigDecimal.valueOf(days), 2, RoundingMode.HALF_DOWN) + " USD.");
            BigDecimal conversionBD =  BigDecimal.valueOf(conversion);
            BigDecimal moneyConverted = money.multiply(conversionBD);
            System.out.println("Your total budget in " + currSymbol + " is " + money.multiply(conversionBD) + " " + currSymbol + ", which per day is " + moneyConverted.divide(BigDecimal.valueOf(days), 2, RoundingMode.HALF_DOWN) + " " + currSymbol + ".");
            System.out.println("**********");
            System.out.println();
            System.out.println();
        }
        // Part 3
        public static void timeDifference() {
            Scanner input = new Scanner(System.in); //create variable
            System.out.print("What is the time difference, in hours, between your home and your destination? ");
            int hourTimeDiff = input.nextInt();
            int noonDestinationTime = (12 + hourTimeDiff);
            System.out.println("That means that when it is midnight at home it will be " + hourTimeDiff + ":00 in your travel destination and when it is noon at home it will be " + noonDestinationTime + ":00");
            System.out.println("**********");
            System.out.println();
            System.out.println();
        }
        // Part 4
        public static void areaConversion() {
            Scanner input = new Scanner(System.in); //create variable
            System.out.print("What is the square area of your destination country in km2? ");
            int areaInKM = input.nextInt();
            double areaInMiles = areaInKM*.386102;
            System.out.println("In miles2 that is " + areaInMiles);
            System.out.println("**********");
            System.out.println();
            System.out.println();
        }
}