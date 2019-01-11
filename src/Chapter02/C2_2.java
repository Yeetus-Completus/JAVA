package Chapter02;

import java.util.Scanner;

/**
 * Displays interest in a loan
 *
 * @author George Hartman
 */
public class C2_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance price: ");
        double balance = input.nextDouble();

        System.out.print("Enter annual intrest rate: ");
        double rate = input.nextDouble();

        double totalRate = (rate / 1200);

        double interest = (balance * totalRate);

        System.out.println("Intrest: " + interest);

    }
}
