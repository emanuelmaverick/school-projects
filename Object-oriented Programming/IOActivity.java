package Chapter3;

import java.util.Scanner;

public class IOActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter another number: ");
        float num2 = scanner.nextFloat();

        float sum = num1 + num2;
        System.out.println("Sum: " + sum);

        float difference = num1 - num2;
        System.out.println("Difference : " + difference);

        float product = num1 * num2;
        System.out.println("Product: " + product);

        float quotient = num1 / num2;
        System.out.println("Quotient: " + quotient);

        int oddCount = 0;
        if (num1 % 2 != 0) {
            System.out.println(num1 + " is an odd number!");
            oddCount++;
        }
        if (num2 % 2 != 0) {
            System.out.println(num2 + " is an odd number!");
            oddCount++;
        }

        System.out.println("There are " + oddCount + " odd number(s)");

    }
}
