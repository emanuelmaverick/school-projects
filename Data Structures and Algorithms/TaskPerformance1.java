package Chapter1;

import java.util.Scanner;

public class TaskPerformance1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("N must be >= 1");
            return;
        }
        if (N == 1) {
            System.out.print("Input Number: ");
            int only = sc.nextInt();
            System.out.println("Large is " + only);
            return;
        }

        System.out.print("Input Number: ");
        int NUM1 = sc.nextInt();

        System.out.print("Input Number: ");
        int LARGE = sc.nextInt();

        int COUNT = 2;

        while (true) {
            if (NUM1 > LARGE) {
                LARGE = NUM1;
            }

            if (COUNT == N) {
                System.out.println("Large is " + LARGE);
                break;
            } else {
                COUNT = COUNT + 1;
                System.out.print("Input Number: ");
                NUM1 = sc.nextInt();
            }
        }
    }
}
