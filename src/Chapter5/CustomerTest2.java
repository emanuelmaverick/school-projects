package Chapter5;

public class CustomerTest2 {
    public static void main(String args[]) {

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

        firstCustomer.displayCustomerInformation();
        secondCustomer.displayCustomerInformation();
        thirdCustomer.displayCustomerInformation();
        fourthCustomer.displayCustomerInformation();
        fifthCustomer.displayCustomerInformation();
    }
}