package Chapter5;

public class PaymentTest {
    public static void main(String[] args) {
        Payment firstPayment = new Payment();
        firstPayment.transDate = "2025-04-28";
        firstPayment.modeOfPayment = "Credit Card";
        firstPayment.customerID = 201;
        firstPayment.name = "Peter Parker";
        firstPayment.cExDate = "06/27";
        firstPayment.cardNo = "1234-5678-9012-3456";
        firstPayment.totalPrice = 199.99;

        Payment secondPayment = new Payment();
        secondPayment.transDate = "2025-04-29";
        secondPayment.modeOfPayment = "Credit Card";
        secondPayment.customerID = 202;
        secondPayment.name = "Mary Jane Watson";
        secondPayment.cExDate = "08/25";
        secondPayment.cardNo = "2345-6789-0123-4567";
        secondPayment.totalPrice = 149.50;

        firstPayment.displayPaymentInformation();
        secondPayment.displayPaymentInformation();
    }
}
