package Chapter5;

public class Shirt {

    public int shirtID = 0;
    public String description = "description required";
    public char colorCode = 'U';
    public double price = 0.0;
    public String status = "Available/Unavailable";
    public String size = "S/M/L";

    public void displayShirtInformation () {

        System.out.println("Shirt ID         : " + shirtID);
        System.out.println("Size             : " + size);
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code       : " + colorCode);
        System.out.println("Shirt Price      : " + price);
        System.out.println("Status           : " + status);
        System.out.println();
    }
}