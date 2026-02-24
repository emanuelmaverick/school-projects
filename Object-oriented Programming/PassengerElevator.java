package Chapter5;

import java.util.Scanner;

public class PassengerElevator {
    private int currentFloor = 1;

    public void operateElevatorWithPassenger(int desiredFloor) {
        System.out.println("\n══════════════════════════════");
        System.out.println("Elevator is starting...");
        openDoor();
        closeDoor();
        System.out.println("══════════════════════════════");

        if (desiredFloor < 1 || desiredFloor > 10) {
            System.out.println("Invalid desired floor: " + desiredFloor + ". Must be between 1 and 10.");
            return;
        }

        if (currentFloor == desiredFloor) {
            System.out.println("Passenger is already at the desired floor: " + currentFloor);
        } else if (currentFloor < desiredFloor) {
            for (int i = currentFloor + 1; i <= desiredFloor; i++) {
                currentFloor = i;
                System.out.println("Going up one floor - Floor: " + currentFloor);
            }
        } else {
            for (int i = currentFloor - 1; i >= desiredFloor; i--) {
                currentFloor = i;
                System.out.println("Going down one floor - Floor: " + currentFloor);
            }
        }

        openDoor();
        closeDoor();
        System.out.println("══════════════════════════════");

        System.out.println("Returning to Ground Floor...");
        if (currentFloor > 1) {
            for (int i = currentFloor - 1; i >= 1; i--) {
                currentFloor = i;
                System.out.println("Going down one floor - Floor: " + currentFloor);
            }
        }
        System.out.println("══════════════════════════════");
    }

    private void openDoor() {
        System.out.println("Opening Door...");
        System.out.println("Door is open.");
    }

    private void closeDoor() {
        System.out.println("Closing Door...");
        System.out.println("Door is closed.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PassengerElevator elevator = new PassengerElevator();

        System.out.print("Enter the desired floor (1-10): ");
        int desiredFloor = scanner.nextInt();

        elevator.operateElevatorWithPassenger(desiredFloor);
        scanner.close();
    }
}