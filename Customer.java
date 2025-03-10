import java.util.Scanner;

public class Customer {

    static String cusName;
    static String cusID;
    static String destination;

    Scanner scanner= new Scanner(System.in);

    void cusDetails(){
        System.out.print("\nEnter your Name: ");
        cusName = scanner.nextLine();
        System.out.print("Enter your ID: ");
        cusID = scanner.nextLine();
        System.out.print("Enter your destination: ");
        destination = scanner.nextLine();
    }

}
