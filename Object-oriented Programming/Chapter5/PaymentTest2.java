package Chapter5;

public class PaymentTest2 {
    public static void main(String[] args) {

        Payment firstPayment = new Payment();
        Payment secondPayment = new Payment();
        Payment thirdPayment = new Payment();
        Payment fourthPayment = new Payment();
        Payment fifthPayment = new Payment();

        firstPayment.transDate = "2025-04-28";
        firstPayment.modeOfPayment = "Credit Card";
        firstPayment.customerID = 201;
        firstPayment.name = "Peter Parker";
        firstPayment.cExDate = "06/27";
        firstPayment.cardNo = "1234-5678-9012-3456";
        firstPayment.totalPrice = 199.99;

        secondPayment.transDate = "2025-04-29";
        secondPayment.modeOfPayment = "Credit Card";
        secondPayment.customerID = 202;
        secondPayment.name = "Mary Jane Watson";
        secondPayment.cExDate = "08/25";
        secondPayment.cardNo = "2345-6789-0123-4567";
        secondPayment.totalPrice = 149.50;

        thirdPayment.transDate = "2025-04-30";
        thirdPayment.modeOfPayment = "Cash on Delivery";
        thirdPayment.customerID = 203;
        thirdPayment.name = "Harry Osborn";
        thirdPayment.cExDate = "09/26";
        thirdPayment.cardNo = "3456-7890-1234-5678";
        thirdPayment.totalPrice = 89.75;

        fourthPayment.transDate = "2025-05-01";
        fourthPayment.modeOfPayment = "Cheque";
        fourthPayment.customerID = 204;
        fourthPayment.name = "Gwen Stacy";
        fourthPayment.cExDate = "11/28";
        fourthPayment.cardNo = "4567-8901-2345-6789";
        fourthPayment.totalPrice = 220.00;

        fifthPayment.transDate = "2025-05-02";
        fifthPayment.modeOfPayment = "Cash on Delivery";
        fifthPayment.customerID = 205;
        fifthPayment.name = "Miles Morales";
        fifthPayment.cExDate = "10/25";
        fifthPayment.cardNo = "5678-9012-3456-7890";
        fifthPayment.totalPrice = 180.25;

        firstPayment.displayPaymentInformation();
        secondPayment.displayPaymentInformation();
        thirdPayment.displayPaymentInformation();
        fourthPayment.displayPaymentInformation();
        fifthPayment.displayPaymentInformation();
    }
}
