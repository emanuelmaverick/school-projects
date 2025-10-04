package Chapter4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Name: Emanuel Maverick G. Yasay
 * Section: CEIT-03-201A
 * Program: Bachelor of Science in Computer Engineering
 * Description: This program calculates the age in years, months, and days based on the user's birthday input.
 */

public class Branching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthday (Month, Date, Year, e.g., MAY 14, 2006):");
        String birthdayInput = scanner.nextLine();

        LocalDate birthday = LocalDate.parse(birthdayInput, java.time.format.DateTimeFormatter.ofPattern("MMMM d, yyyy"));
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthday, today);

        System.out.println("Age in Years = " + age.getYears() + " yrs");
        System.out.println("Age in Months = " + age.getMonths() + " months");
        System.out.println("Age in Days = " + age.getDays() + " days");
    }
}
