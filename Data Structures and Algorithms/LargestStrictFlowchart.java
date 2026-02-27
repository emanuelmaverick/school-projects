import java.util.Scanner;

public class LargestStrictFlowchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("N must be >= 1");
            sc.close();
            return;
        }

        if (N == 1) {
            System.out.print("Enter number 1: ");
            double only = sc.nextDouble();
            System.out.println("Largest = " + only);
            sc.close();
            return;
        }

        System.out.print("Enter number 1: ");
        double NUM1 = sc.nextDouble();

        System.out.print("Enter number 2: ");
        double LARGE = sc.nextDouble();

        int COUNT = 2;

        while (true) {
            if (NUM1 > LARGE) {
                LARGE = NUM1;
            }

            if (COUNT == N) {
                System.out.println("Largest = " + LARGE);
                break;
            } else {
                COUNT = COUNT + 1;
                System.out.print("Enter number " + COUNT + ": ");
                NUM1 = sc.nextDouble();
            }
        }

        sc.close();
    }
}
