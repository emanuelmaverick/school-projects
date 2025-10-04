package Chapter5;

public class ShirtTest2 {
    public static void main(String args[]) {

        Shirt firstShirt = new Shirt();
        Shirt secondShirt = new Shirt();
        Shirt thirdShirt = new Shirt();
        Shirt fourthShirt = new Shirt();
        Shirt fifthShirt = new Shirt();

        firstShirt.shirtID = 201;
        firstShirt.description = "Uniqlo Airism Tee";
        firstShirt.size = "M";
        firstShirt.colorCode = 'W';
        firstShirt.price = 799.99;
        firstShirt.status = "Available";

        secondShirt.shirtID = 202;
        secondShirt.description = "H&M Slim Fit Shirt";
        secondShirt.size = "L";
        secondShirt.colorCode = 'B';
        secondShirt.price = 899.50;
        secondShirt.status = "Available";

        thirdShirt.shirtID = 203;
        thirdShirt.description = "Bershka Graphic Tee";
        thirdShirt.size = "S";
        thirdShirt.colorCode = 'G';
        thirdShirt.price = 699.00;
        thirdShirt.status = "Available";

        fourthShirt.shirtID = 204;
        fourthShirt.description = "Levi's Classic Crew";
        fourthShirt.size = "M";
        fourthShirt.colorCode = 'N';
        fourthShirt.price = 1199.00;
        fourthShirt.status = "Unavailable";

        fifthShirt.shirtID = 205;
        fifthShirt.description = "Ralph Lauren Polo";
        fifthShirt.size = "L";
        fifthShirt.colorCode = 'R';
        fifthShirt.price = 2499.99;
        fifthShirt.status = "Available";

        firstShirt.displayShirtInformation();
        secondShirt.displayShirtInformation();
        thirdShirt.displayShirtInformation();
        fourthShirt.displayShirtInformation();
        fifthShirt.displayShirtInformation();
    }
}