package Chapter5;

import java.util.Scanner;

public class ElevatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevator elevator = new Elevator();

        System.out.print("How many floors will the elevator be passing? ");
        int num = scanner.nextInt();
        int[] floorRequests = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("[" + (i + 1) + "] Which floor will you go to? [1 - 10]: ");
            int floor = scanner.nextInt();

            while (true) {
                if (floor >= 1 && floor <= 10) {
                    floorRequests[i] = floor;
                    break;
                } else {
                    System.out.println("Invalid floor. Please enter a floor between 1 and 10.");
                    System.out.print("[" + (i + 1) + "] Which floor will you go to? [1 - 10]: ");
                    floor = scanner.nextInt();
                }
            }
        }

        elevator.operateElevator(floorRequests);
        scanner.close();
    }
}