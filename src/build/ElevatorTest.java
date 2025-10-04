package build;

import java.util.Scanner;
public class ElevatorTest {
    public static void main(String [] args){
        Elevator El = new Elevator();
        Scanner input = new Scanner(System.in);
        int[] floors = new int[10];
        int i = 0;
        while (true) {
            System.out.print("How many floors will the elevator be passing? ");
            i = input.nextInt();
            input.nextLine();
            if (i>10){
                System.out.println("This elevator can only take up to 10 inputs");
            } else {break;}
        }
        for (int o = 0; i!=o; o++){
            System.out.print("[" + (o+1) +"] Which floor will you go? [" + El.MIN_FLOOR +" - "+ El.TOP_FLOOR +"] ");
            int temp = input.nextInt(); input.nextLine();
            if ((temp>El.TOP_FLOOR) || (temp<El.MIN_FLOOR)){System.out.println("Invalid Floor"); o--;continue;}
            floors[o] = temp;
        }
        El.currentFloor = 5;
        El.setMultipleFloor(floors);
    }
}
