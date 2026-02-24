package Chapter5;

public class Customer {

    public int customerID = 0;
    public String name = "Name Required";
    public String address = "Address Required";
    public String phoneNumber = "Phone Number Required";
    public String emailAddress = "Email Address Required";
    public String customerStatus = "Active/Non Active";

    public void displayCustomerInformation () {

        System.out.println("Customer ID        : " + customerID);
        System.out.println("Name               : " + name);
        System.out.println("Address            : " + address);
        System.out.println("Phone Number       : " + phoneNumber);
        System.out.println("Email Address      : " + emailAddress);
        System.out.println("Customer Status    : " + customerStatus);
        System.out.println();
    }
}