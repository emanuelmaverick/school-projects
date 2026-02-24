package Chapter4;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter up to 5 positive numbers (negative numbers and zero will be skipped)");

        while (count < 5) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int number = scanner.nextInt();

            if (number > 0) {
                sum += number;
                count++;
            } else {
                System.out.println("Skipped: " + number);
            }
        }

        System.out.println("The sum of the entered positive numbers is: " + sum);
    }
}
