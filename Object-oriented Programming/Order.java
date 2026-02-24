import Chapter5.Customer;
import Chapter5.Payment;
import Chapter5.Shirt;


import java.util.ArrayList;


public class Order {
    Customer customer;
    Payment customerPaymentInfo;
    private ArrayList<Item> cart;


    public Order(Customer customer) {
        this.customer = customer;
        this.cart = new ArrayList<>();
    }


    class Item {
        Shirt shirt;
        int quantity;


        Item(Shirt shirt, int quantity) {
            this.shirt = shirt;
            this.quantity = quantity;
        }


        double getTotalPrice() {
            return shirt.price * quantity;
        }
    }


    public void addToCart(Shirt shirt, int quantity) {
        cart.add(new Item(shirt, quantity));
    }


    public double getTotalPrice() {
        double total = 0;
        for (Item item : cart) {
            total += item.getTotalPrice();
        }
        return total;
    }


    public void displayOrderInfo() {
        System.out.println("╔════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                DEMAND APPAREL CO.                                ");
        System.out.println("                      With Great Style Comes Great Confidence                     ");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("  Customer Name      : " + customer.name);
        System.out.println("  Transaction Date   : " + customerPaymentInfo.transDate);
        System.out.println("  Customer Address   : " + customer.address);
        System.out.println("╠════════════════════════════════════ Orders ════════════════════════════════════╣");
        System.out.printf("    %-10s %-8s %-20s %-8s %-8s %-10s %-10s%n", "ShirtID", "Size", "Description", "Color", "Price", "Quantity", "Total");


        for (Item item : cart) {
            System.out.printf("    %-10d %-8s %-20s %-8s %-8.1f %-10d %-10.1f%n",
                    item.shirt.shirtID,
                    item.shirt.size,
                    item.shirt.description,
                    item.shirt.colorCode,
                    item.shirt.price,
                    item.quantity,
                    item.getTotalPrice());
        }


        System.out.println("╠════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("                                Total Price: " + getTotalPrice());


        System.out.println("╠════════════════════════════════════ Payment ═══════════════════════════════════╣");
        System.out.println("    Mode of Payment    : " + customerPaymentInfo.modeOfPayment);
        System.out.println("    Card No.           : " + customerPaymentInfo.cardNo);
        System.out.println("    Card Expiry Date   : " + customerPaymentInfo.cExDate);
        System.out.println("╚════════════════════════════════════════════════════════════════════════════════╝\n");
    }
}
