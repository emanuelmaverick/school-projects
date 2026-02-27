import java.util.Scanner;

public class LB01TV {
    int channel;
    int volumeLevel;
    boolean on;
    String cartoon;

    public void turnOn() { on = true; }
    public void turnOff() { on = false; }
    public boolean isOn() { return on; }

    public void displayStatus() {
        if (on) {
            System.out.println("TV is on and current channel is " + channel + "\n" +
                    "Volume Level: " + volumeLevel);
            if (cartoon != null) {
                System.out.println("Cartoon Movie: " + cartoon);
            }
        } else {
            System.out.println("TV is off");
        }
    }

    public void cartoon(String movie) {
        if (on) {
            cartoon = movie;
        } else {
            System.out.println("Turn on TV first.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LB01YASAYTV myTV = new LB01YASAYTV();

        System.out.print("Turn TV on? (yes/no): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {
            myTV.turnOn();

            System.out.print("Enter channel number: ");
            myTV.channel = sc.nextInt();

            System.out.print("Enter volume level: ");
            myTV.volumeLevel = sc.nextInt();
            sc.nextLine();

            System.out.print("Cartoon Movie: ");
            String movie = sc.nextLine();
            myTV.cartoon(movie);

        } else {
            myTV.turnOff();
            System.out.println("You chose to keep the TV off.");
        }

        myTV.displayStatus();
        sc.close();
    }
}
