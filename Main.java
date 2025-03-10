import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("           FOOD EATS           ");
        System.out.println("_______________________________");

        System.out.println("\n-Welcome our Esteemed Customer-");
        System.out.println("Please provide us with your Details for Easier Delivery First.");

        int choice;
        do {
            System.out.println("\n           MAIN MENU           \n");
            System.out.println("1.     Customer Registration");
            System.out.println("2.     Make Order");
            System.out.println("3.     View Order");
            System.out.println("4.     Generate Receipt");
            System.out.println("5.     Exit");



            System.out.print("\nEnter option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                Customer customer = new Customer();
                customer.cusDetails();
            } else if (choice == 2) {
                Food food = new Food();
                food.disMenu();
            } else if (choice == 3) {
                Order order = new Order();
                order.disOrder();
            } else if(choice == 4){
                Receipt receipt = new Receipt();
                Receipt.disReceipt();
            } else if (choice > 5) {
                System.out.println("!!   INVALID OPTION   !!");
            }


        }while (choice != 5) ;


    }
}