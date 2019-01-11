package Chapter02;

import java.util.Scanner;

/**
 * Displays cost of driving
 *
 * @author George Hartman
 */
public class C2_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter driving distance: ");
        double drivingDistance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double milesGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double priceGallon = input.nextDouble();

        double costDriving = ((drivingDistance / milesGallon) * priceGallon);

        System.out.println("Cost of driving: " + costDriving);

    }
}
