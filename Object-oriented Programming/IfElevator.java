package Chapter5;

public class IfElevator {
    private int currentFloor = 1;

    public void operateElevator(int[] requestedFloors) {
        if (requestedFloors == null || requestedFloors.length == 0) {
            System.out.println("No floors requested. Elevator will remain at Floor 1.");
            return;
        }

        java.util.Set<Integer> uniqueFloors = new java.util.TreeSet<>();
        for (int floor : requestedFloors) {
            if (floor >= 1 && floor <= 10) {
                uniqueFloors.add(floor);
            } else {
                System.out.println("Invalid floor detected and ignored: " + floor);
            }
        }

        System.out.println("\n══════════════════════════════");
        System.out.println("Elevator is starting...");
        openDoor();
        closeDoor();
        System.out.println("══════════════════════════════");

        for (int targetFloor : uniqueFloors) {
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