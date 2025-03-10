import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Food {
    int choice1;

    static Scanner scanner = new Scanner(System.in);

    static ArrayList<String> orderNames = new ArrayList<>();
    static ArrayList<Integer> orderPrices = new ArrayList<>();

    void disMenu() {
        int choice;

        while (true) { // Loop the menu
            System.out.println("\n______Our Menu Options_______");
            System.out.println("       1.   Breakfast          ");
            System.out.println("       2.   Lunch              ");
            System.out.println("       3.   Dinner             ");
            System.out.println("       4.   Pastries           ");
            System.out.println("       5.   Drinks             ");
            System.out.println("       6.   View Order         ");
            System.out.println("       0.   Exit               ");

            System.out.print("\n-- Choose Meal Option: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("\n-- Exiting menu. Thank you!");
                break; // Exit the loop
            } else if (choice == 6) {
                viewOrder();
            }

            selectMeal(choice); // Handle meal selection
        }
    }

    void selectMeal(int choice) {
        String[][] menuItems = {
                {"Avocado Toast", "Bacon & Sausage", "Buttered Bread", "Doughnut", "Mahamri", "Banana Pancakes"},
                {"Beef Sandwich", "Chicken Burger", "Veggie Burger", "Chips Sausage", "Beef Tacos", "Spaghetti MeatBalls"},
                {"Ugali Fish", "Chicken Pilau", "Chapo Ndegu", "Rice Minji", "Ugali Special", "Chapo Special"},
                {"Black Forest Cake", "Chocolate Muffins", "Vanilla Surprise", "Strawberry Shortcakes", "Lemon Cake"},
                {"1L - Flavoured Water", "1L - Coke", "1L - Mango Smoothie", "1L - Sprite", "1L - Pineapple Yoghurt"}
        };

        int[][] menuPrices = {
                {100, 200, 50, 50, 70, 100},
                {250, 250, 150, 300, 250, 170},
                {300, 250, 200, 250, 350, 250},
                {300, 250, 300, 250, 250},
                {150, 170, 200, 170, 200}
        };

        if (choice < 1 || choice > 6) {
            System.out.println("!! INVALID CHOICE !!");
            return;
        }

        System.out.println("\n______" + getMealType(choice) + " Menu______");
        for (int i = 0; i < menuItems[choice - 1].length; i++) {
            System.out.println((i + 1) + ".   :    " + menuItems[choice - 1][i] + "   :   ksh." + menuPrices[choice - 1][i]);
        }

        System.out.print("\n-- Enter Meal Number to Order (0 Back to Menu): ");
        choice1 = scanner.nextInt();

        while (choice1 != 0 || choice < menuItems.length) {
            if (choice1 >= 1 && choice1 <= menuItems[choice - 1].length) {
                String orderedMeal = menuItems[choice - 1][choice1 - 1];
                int mealPrice = menuPrices[choice - 1][choice1 - 1];

                orderNames.add(orderedMeal);
                orderPrices.add(mealPrice);

                System.out.println("\n✅ Order placed for " + orderedMeal + " - Ksh. " + mealPrice);
                System.out.print("\n-- Enter Meal Number to Order (0 Back to Menu): ");
                choice1 = scanner.nextInt();
            } else {
                System.out.println("Invalid selection! Try again.");
            }

        }


    }

    static void modOrder(){
        System.out.println("            Your Order             ");
        for (int i = 0; i < orderNames.size(); i++) {
            System.out.println((i + 1) + ".    :  " + orderNames.get(i) + "     :  Ksh." + orderPrices.get(i));
        }
        System.out.println("\n1. Continue with ordered meals");
        System.out.println("2. Remove any ordered meal");
        System.out.println("\nEnter Option: ");

        int choice3 = scanner.nextInt();

        while (choice3 == 2) {
            System.out.print("\nEnter the number of the meal to remove (or 0 to stop removing): ");
            int indx = scanner.nextInt();

            if (indx == 0) {
                break;  // Exit the loop if the user enters 0
            }

            // Validate index input
            if (indx < 1 || indx > orderNames.size()) {
                System.out.println("❌ Invalid selection! Please enter a valid meal number.");
            } else {
                // Remove the selected meal (adjust index since user input is 1-based)
                System.out.println("✅ Removed: " + orderNames.get(indx - 1));
                orderNames.remove(indx - 1);
                orderPrices.remove(indx - 1);
                System.out.println("\nYour Current Orders:");
                for (int i = 0; i < orderNames.size(); i++) {
                    System.out.println((i + 1) + ".    :  " + orderNames.get(i) + "     :  Ksh." + orderPrices.get(i));
                }
            }

            modOrder();
        }
    }
    static void viewOrder() {
        if (orderNames.isEmpty()) {
            System.out.println("\n🛒 Your order is empty.");
        } else {
            System.out.println("\n            Order              ");
            int total = 0;
            for (int i = 0; i < orderNames.size(); i++) {
                System.out.println((i + 1) + ".    :  " + orderNames.get(i) + "     :  Ksh." + orderPrices.get(i));
                total += orderPrices.get(i);
            }
            System.out.println("\n_______________________________");

            System.out.println("\nTOTAL Bill:              ksh." + total);

        }
    }

    String getMealType(int choice) {
        return switch (choice) {
            case 1 -> "Breakfast";
            case 2 -> "Lunch";
            case 3 -> "Dinner";
            case 4 -> "Pastries";
            case 5 -> "Drinks";
            default -> "Unknown";
        };
    }


}
