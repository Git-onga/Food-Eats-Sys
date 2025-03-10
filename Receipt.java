public class Receipt {
    static void disReceipt(){

        System.out.println("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("           FOOD EATS           ");
        System.out.println("_______________________________");

        System.out.println("\n            Details            ");
        System.out.println("Customer's Name: " + Customer.cusName);
        System.out.println("Customer's ID: " + Customer.cusID);
        System.out.println("Customer's Destination: " + Customer.destination);

        System.out.println("\n_______________________________");

        Food.viewOrder();

        System.out.println("\n  THANK YOU FOR EATING WITH US  ");
    }
}
