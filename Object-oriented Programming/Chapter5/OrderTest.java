import Chapter5.Customer;
import Chapter5.Payment;
import Chapter5.Shirt;


public class OrderTest {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer();
        Customer secondCustomer = new Customer();
        Customer thirdCustomer = new Customer();
        Customer fourthCustomer = new Customer();
        Customer fifthCustomer = new Customer();


        firstCustomer.customerID = 201;
        firstCustomer.name = "Peter Parker";
        firstCustomer.address = "Queens, New York";
        firstCustomer.phoneNumber = "09170000001";
        firstCustomer.emailAddress = "peter.parker@gmail.com";
        firstCustomer.customerStatus = "Active";


        secondCustomer.customerID = 202;
        secondCustomer.name = "Mary Jane Watson";
        secondCustomer.address = "Manhattan, New York";
        secondCustomer.phoneNumber = "09170000002";
        secondCustomer.emailAddress = "mj.watson@gmail.com";
        secondCustomer.customerStatus = "Non Active";


        thirdCustomer.customerID = 203;
        thirdCustomer.name = "Harry Osborn";
        thirdCustomer.address = "Upper East Side, New York";
        thirdCustomer.phoneNumber = "09170000003";
        thirdCustomer.emailAddress = "harry.osborn@gmail.com";
        thirdCustomer.customerStatus = "Non Active";


        fourthCustomer.customerID = 204;
        fourthCustomer.name = "Gwen Stacy";
        fourthCustomer.address = "Brooklyn, New York";
        fourthCustomer.phoneNumber = "09170000004";
        fourthCustomer.emailAddress = "gwen.stacy@gmail.com";
        fourthCustomer.customerStatus = "Active";


        fifthCustomer.customerID = 205;
        fifthCustomer.name = "Miles Morales";
        fifthCustomer.address = "Brooklyn, New York";
        fifthCustomer.phoneNumber = "09170000005";
        fifthCustomer.emailAddress = "miles.morales@gmail.com";
        fifthCustomer.customerStatus = "Active";


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


        Payment thirdPayment = new Payment();
        thirdPayment.transDate = "2025-04-30";
        thirdPayment.modeOfPayment = "Cash on Delivery";
        thirdPayment.customerID = 203;
        thirdPayment.name = "Harry Osborn";
        thirdPayment.cExDate = null;
        thirdPayment.cardNo = null;
        thirdPayment.totalPrice = 89.75;


        Payment fourthPayment = new Payment();
        fourthPayment.transDate = "2025-05-01";
        fourthPayment.modeOfPayment = "Cheque";
        fourthPayment.customerID = 204;
        fourthPayment.name = "Gwen Stacy";
        fourthPayment.cExDate = "11/28";
        fourthPayment.cardNo =  null;
        fourthPayment.totalPrice = 220.00;


        Payment fifthPayment = new Payment();
        fifthPayment.transDate = "2025-05-02";
        fifthPayment.modeOfPayment = "Cash on Delivery";
        fifthPayment.customerID = 205;
        fifthPayment.name = "Miles Morales";
        fifthPayment.cExDate = null;
        fifthPayment.cardNo = null;
        fifthPayment.totalPrice = 180.25;


        Shirt firstShirt = new Shirt();
        firstShirt.shirtID = 201;
        firstShirt.description = "Uniqlo Airism Tee";
        firstShirt.size = "M";
        firstShirt.colorCode = 'W';
        firstShirt.price = 799.99;
        firstShirt.status = "Available";


        Shirt secondShirt = new Shirt();
        secondShirt.shirtID = 202;
        secondShirt.description = "H&M Slim Fit Shirt";
        secondShirt.size = "L";
        secondShirt.colorCode = 'B';
        secondShirt.price = 899.50;
        secondShirt.status = "Available";


        Shirt thirdShirt = new Shirt();
        thirdShirt.shirtID = 203;
        thirdShirt.description = "Bershka Graphic Tee";
        thirdShirt.size = "S";
        thirdShirt.colorCode = 'G';
        thirdShirt.price = 699.00;
        thirdShirt.status = "Available";


        Shirt fourthShirt = new Shirt();
        fourthShirt.shirtID = 204;
        fourthShirt.description = "Levi's Classic Crew";
        fourthShirt.size = "M";
        fourthShirt.colorCode = 'N';
        fourthShirt.price = 1199.00;
        fourthShirt.status = "Unavailable";


        Shirt fifthShirt = new Shirt();
        fifthShirt.shirtID = 205;
        fifthShirt.description = "Ralph Lauren Polo";
        fifthShirt.size = "L";
        fifthShirt.colorCode = 'R';
        fifthShirt.price = 2499.99;
        fifthShirt.status = "Available";


        Shirt sixthShirt = new Shirt();
        sixthShirt.shirtID = 206;
        sixthShirt.description = "Zara Boxy Tee";
        sixthShirt.size = "M";
        sixthShirt.colorCode = 'B';
        sixthShirt.price = 899.00;
        sixthShirt.status = "Available";


        Shirt seventhShirt = new Shirt();
        seventhShirt.shirtID = 207;
        seventhShirt.description = "Muji Quick Dry Tee";
        seventhShirt.size = "S";
        seventhShirt.colorCode = 'W';
        seventhShirt.price = 900.00;
        seventhShirt.status = "Available";


        Order order1 = new Order(firstCustomer);
        order1.customerPaymentInfo = firstPayment;
        order1.addToCart(thirdShirt, 1);
        order1.addToCart(firstShirt, 1);
        order1.addToCart(sixthShirt, 1);
        order1.addToCart(fourthShirt, 1);
        order1.addToCart(secondShirt, 1);
        firstPayment.totalPrice = order1.getTotalPrice();


        Order order2 = new Order(secondCustomer);
        order2.customerPaymentInfo = secondPayment;
        order2.addToCart(fifthShirt, 1);
        order2.addToCart(seventhShirt, 1);
        order2.addToCart(firstShirt, 1);
        order2.addToCart(thirdShirt, 1);
        order2.addToCart(secondShirt, 1);
        secondPayment.totalPrice = order2.getTotalPrice();


        Order order3 = new Order(thirdCustomer);
        order3.customerPaymentInfo = thirdPayment;
        order3.addToCart(secondShirt, 1);
        order3.addToCart(fourthShirt, 1);
        order3.addToCart(sixthShirt, 1);
        order3.addToCart(seventhShirt, 1);
        order3.addToCart(firstShirt, 1);
        thirdPayment.totalPrice = order3.getTotalPrice();


        Order order4 = new Order(fourthCustomer);
        order4.customerPaymentInfo = fourthPayment;
        order4.addToCart(thirdShirt, 1);
        order4.addToCart(fifthShirt, 1);
        order4.addToCart(seventhShirt, 1);
        order4.addToCart(firstShirt, 1);
        order4.addToCart(sixthShirt, 1);
        fourthPayment.totalPrice = order4.getTotalPrice();


        Order order5 = new Order(fifthCustomer);
        order5.customerPaymentInfo = fifthPayment;
        order5.addToCart(fourthShirt, 1);
        order5.addToCart(secondShirt, 1);
        order5.addToCart(sixthShirt, 1);
        order5.addToCart(seventhShirt, 1);
        order5.addToCart(fifthShirt, 1);
        fifthPayment.totalPrice = order5.getTotalPrice();


        order1.displayOrderInfo();
        order2.displayOrderInfo();
        order3.displayOrderInfo();
        order4.displayOrderInfo();
        order5.displayOrderInfo();
    }
}
