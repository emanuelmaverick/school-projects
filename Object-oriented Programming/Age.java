package Chapter2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.YearMonth;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Type Birthdate in this format (MM/DD/YYYY): ");
        String birthDate = scan.nextLine();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate BDay = LocalDate.parse(birthDate, format);

        LocalDate today = LocalDate.now();
        //LocalDate today = LocalDate.parse("02/28/2025", format);

        int days = BDay.datesUntil(today).toArray().length;
        long months = ChronoUnit.MONTHS.between(YearMonth.from(BDay), YearMonth.from(today)) - 1;
        int hours = days * 24;
        int seconds = hours * 60 * 60;

        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Seconds: " + seconds);
    }
}
