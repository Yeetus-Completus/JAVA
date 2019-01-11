package Chapter02;

import java.util.Scanner;

/**
 * Displays price
 *
 * @author George Hartman
 */
public class P2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hamburger price:");
        double hamburger = input.nextDouble();

        System.out.print("Enter drink price:");
        double drink = input.nextDouble();

        System.out.print("Enter dessert price:");
        double dessert = input.nextDouble();

        double tax = ((hamburger + drink + dessert) * .10);

        double tip = ((hamburger + drink + dessert + tax) * .15);

        double price = (hamburger + drink + dessert + tax + tip);

        System.out.println("Tax:" + tax);

        System.out.println("Tip:" + tip);

        System.out.println("Price:" + price);
    }
}
