package Chapter4;

import java.util.Scanner;

public class ControlStructuresUsingSelectionStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input any month of the year: ");
        String month = scanner.nextLine().toLowerCase();

        if (month.equals("january")) {
            System.out.println("New year, new beginnings, endless possibilities! (Winter)");
        } else if (month.equals("february")) {
            System.out.println("Let your heart be as warm as February’s embrace! (Winter)");
        } else if (month.equals("march")) {
            System.out.println("March in with confidence and bloom with every step! (Spring)");
        } else if (month.equals("april")) {
            System.out.println("April whispers new beginnings, just like the first raindrops! (Spring)");
        } else if (month.equals("may")) {
            System.out.println("Let your dreams blossom like flowers in May! (Spring)");
        } else if (month.equals("june")) {
            System.out.println("The sun-kissed start to summer! (Summer)");
        } else if (month.equals("july")) {
            System.out.println("Lazy days, fireworks, and making memories that last forever! (Summer)");
        } else if (month.equals("august")) {
            System.out.println("August slipped away into a moment of time! (Summer)");
        } else if (month.equals("september")) {
            System.out.println("Summer fades into fall, and magic fills the air! (Fall)");
        } else if (month.equals("october")) {
            System.out.println("Falling leaves, cozy nights, and pumpkin lights! (Fall)");
        } else if (month.equals("november")) {
            System.out.println("November whispers of cozy sweaters, golden sunsets, and thankfulness! (Fall)");
        } else if (month.equals("december")) {
            System.out.println("It’s the most wonderful time of the year! (Winter)");
        } else {
            System.out.println("Sorry, you have inputted an invalid or misspelled value of month of the year!");
        }
    }
}
