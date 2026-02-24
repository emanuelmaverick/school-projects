package Chapter5;

public class Elevator {
    private int currentFloor = 1;

    public void operateElevator(int[] requestedFloors) {
        java.util.Arrays.sort(requestedFloors);

        System.out.println("\n══════════════════════════════");
        System.out.println("Elevator is starting...");
        openDoor();
        closeDoor();
        System.out.println("══════════════════════════════");

        for (int targetFloor : requestedFloors) {
            if (currentFloor < targetFloor) {
                for (int i = currentFloor + 1; i <= targetFloor; i++) {
                    currentFloor = i;
                    System.out.println("Going up one floor - Floor: " + currentFloor);
                }
            } else if (currentFloor > targetFloor) {
                for (int i = currentFloor - 1; i >= targetFloor; i--) {
                    currentFloor = i;
                    System.out.println("Going down one floor - Floor: " + currentFloor);
                }
            } else {
                System.out.println("Already at Floor: " + currentFloor);
            }

            openDoor();
            closeDoor();
            System.out.println("══════════════════════════════");
        }

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
}