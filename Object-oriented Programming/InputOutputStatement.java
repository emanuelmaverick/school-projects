package Chapter3;

import java.util.Scanner;

public class InputOutputStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your nickname: ");
        String nickname = scanner.nextLine();

        System.out.print("Enter your birth month: ");
        String birthMonth = scanner.nextLine();

        System.out.print("Enter your birth day: ");
        int birthDay = scanner.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite movie: ");
        String favoriteMovie = scanner.nextLine();

        System.out.print("Enter your favorite food: ");
        String favoriteFood = scanner.nextLine();

        System.out.print("Enter your hobbies/interest: ");
        String hobbies = scanner.nextLine();

        int currentYear = 2025;
        int age = currentYear - birthYear;

        System.out.println("\nHi " + nickname + ", I hope we could celebrate this coming " + birthMonth + " as you turn " + age + " years old.");
        System.out.println("Let's watch that " + favoriteMovie + " movie that you used to watch, while having some " + favoriteFood + ".");
        System.out.println("Perhaps you could also teach me how to " + hobbies + ".");
    }
}
