import java.util.Scanner;

public class shopping_cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = sc.nextLine();
        System.out.print("What is the price for each?: ");
        double price = sc.nextDouble();
        System.out.print("How many would you like?: ");
        int quantity = sc.nextInt();

        // System.out.println("You have bought " + quantity + " " + item + "(s).");
        // System.out.println("Your total is " + price * quantity + ".");
        System.out.printf("\nYou have bought %d %s(s).\n", quantity, item);
        System.out.printf("Your total is ₹%.2f.\n", price * quantity); //! '₹' not printing at the momen, will do something for it to work.

        sc.close();
    }
}
