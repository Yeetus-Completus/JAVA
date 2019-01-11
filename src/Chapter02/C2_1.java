package Chapter02;

import java.util.Scanner;

/**
 * Displays acceleration
 *
 * @author George Hartman
 */
public class C2_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first velocity input: ");
        double vOne = input.nextDouble();

        System.out.print("Enter second velocity input: ");
        double vTwo = input.nextDouble();

        System.out.print("Enter time: ");
        double time = input.nextDouble();

        double acceleration = ((vTwo - vOne) / time);

        System.out.println("Acceleration: " + acceleration);

    }

}
