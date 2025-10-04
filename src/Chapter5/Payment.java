package Chapter5;

public class Payment {

    public String transDate = "Transaction Date Required";
    public String modeOfPayment = "Payment Mode Required";
    public int customerID = 0;
    public String name = "Name Required";
    public String cExDate = "Card Expiry Date Required";
    public String cardNo = "Card Number Required";
    public double totalPrice = 0.0;

    public void displayPaymentInformation() {

        System.out.println("Transaction Date   : " + transDate);
        System.out.println("Mode of Payment    : " + modeOfPayment);
        System.out.println("Customer ID        : " + customerID);
        System.out.println("Name               : " + name);
        System.out.println("Card Expiry Date   : " + cExDate);
        System.out.println("Card Number        : " + cardNo);
        System.out.println("Total Price        : ₱" + totalPrice);
        System.out.println();
    }
}
