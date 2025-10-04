package build;

import java.util.Arrays;
import java.util.Scanner;

public class Elevator {
    public boolean doorOpen = false;
    public int currentFloor = 1;
    public final int MIN_FLOOR = 1;
    public final int TOP_FLOOR = 10;
    public Scanner input = new Scanner(System.in);

    public void openDoor(){
        if (doorOpen){System.out.print("\nDoor is already opened"); return;}
        System.out.print("\nOpening Door...");
        doorOpen = true;
        System.out.print("\nDoor is open");
    }

    public void closeDoor(){
        if (!doorOpen){System.out.print("\nDoor is already closed"); return;}
        System.out.print("\nClosing Door...");
        doorOpen = false;
        System.out.print("\nDoor is closed");
    }

    public void goUp(){
        if (currentFloor >= TOP_FLOOR){
            System.out.print("\nYou're at the highest floor. You can't elevate any further\n"); return;
        }
        if (doorOpen){closeDoor();}
        System.out.print("\nGoing up one floor");
        currentFloor++;
        System.out.print(" - Floor: " + currentFloor + "\n");
    }

    public void goDown(){
        if (currentFloor <= MIN_FLOOR){
            System.out.print("\nYou're at the lowest floor. You can't go down any further\n"); return;
        }
        if (doorOpen){closeDoor();}
        System.out.print("\nGoing down one floor");
        currentFloor--;
        System.out.print(" - Floor: " + currentFloor + "\n");
    }

    public void setFloor(){
        while (true){
            int desiredFloor = 0;
            while (true) {
                System.out.print("\nEnter desired floor: ");
                desiredFloor = input.nextInt();
                if (desiredFloor > TOP_FLOOR){System.out.print("The elevator can only go up to the " + TOP_FLOOR + "th floor"); continue;}
                else if (MIN_FLOOR>desiredFloor){System.out.print("The elevator can only go down to the 1st Floor"); continue;}
                else if (desiredFloor==currentFloor){
                    System.out.print("You're already here"); continue;
                }
                break;
            }
            while (currentFloor!=desiredFloor) {
                if (desiredFloor > currentFloor) {
                    goUp();
                } else {
                    goDown();
                }
            }
            openDoor();
            closeDoor();
        }
    }

    static int[] reverse(int a[]) {
        int n = a.length;
        int[] b = new int[n];
        int o = n;
        for (int i = 0; i < n; i++) {
            b[o - 1] = a[i];
            o--;
        }
        return b;
    }

    public void setMultipleFloor(int[] floors){
        if ((currentFloor == MIN_FLOOR)||(currentFloor==TOP_FLOOR)){ // Method when elevator is currently at either end
            int[] sorted = Arrays.stream(floors).sorted().toArray();
            if (currentFloor==TOP_FLOOR){
                sorted = reverse(sorted);
            }
            for (int floor: sorted){
                if (floor == 0){System.out.print("Skipping..."); continue;}
                while (currentFloor!=floor) {
                    if (floor > currentFloor) {
                        goUp();
                    } else {
                        goDown();
                    }
                }
                openDoor();
                closeDoor();
            }
        } else { // Method when elevator has to decide which direction first
            int[] floors1 = new int[10];
            int[] floors2 = new int[10];

            int first = floors[0];
            floors[0] = 0;
            floors1[0] = first;
            System.out.println("First: " + first);
            int p = 0;
            for (int f: floors){
                if (f == 0){continue;}
                if ((first > currentFloor && f > first) || (first < currentFloor && f < first)) {
                    floors1[p+1] = f;
                } else {
                    floors2[p] = f;
                }
                p++;
            }

            floors1 = (first > currentFloor) ? Arrays.stream(floors1).sorted().toArray() : reverse(Arrays.stream(floors1).sorted().toArray());
            floors2 = (first > currentFloor) ? reverse(Arrays.stream(floors2).sorted().toArray()) : Arrays.stream(floors2).sorted().toArray();

            for (int floor: floors1){
                if (floor == 0){continue;}
                while (currentFloor!=floor) {
                    if (floor > currentFloor) {
                        goUp();
                    } else {
                        goDown();
                    }
                }
                openDoor();
                closeDoor();
            }

            for (int floor: floors2){
                if (floor == 0){continue;}
                while (currentFloor!=floor) {
                    if (floor > currentFloor) {
                        goUp();
                    } else {
                        goDown();
                    }
                }
                openDoor();
                closeDoor();
            }
        }
    }

    public void operateElevator(int[] floorRequests) {

    }
}
