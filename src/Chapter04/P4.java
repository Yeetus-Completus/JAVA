package Chapter04;

import java.util.Scanner;

/**
 * Compares two bidders
 *
 * @author George Hartman
 */
public class P4 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask name
        System.out.println("The details below concern the first bidder");
        System.out.print("Name: ");
        String name = input.next();

        //Ask hours
        System.out.print("Hours: ");

        int hours = input.nextInt();

        //Ask price 
        System.out.print("Price: ");

        float price = input.nextFloat();

        //Ask name
        System.out.println("The details below concern the second bidder: ");
        System.out.print("Name: ");

        String nameTwo = input.next();

        //Ask hours
        System.out.print("Hours:  ");

        int hoursTwo = input.nextInt();

        //Ask price 
        System.out.print("Price: ");

        float priceTwo = input.nextFloat();

        float cost = (hours * price);
        float costTwo = (hoursTwo * priceTwo);

        System.out.printf("The cost of the first bidder is %.2f \n ", cost);
        System.out.printf("The cost of the second bidder is %.2f \n", costTwo);
        System.out.println("-------Bid Winner-------");

        if (cost < costTwo) {
            System.out.printf("Name: %s ", name);
            System.out.printf("Cost: %f", cost);
        } else if (cost > costTwo) {
            System.out.printf("Name: %s ", nameTwo);
            System.out.printf("Cost: %f", costTwo);
        } else if (cost == costTwo && hours < hoursTwo) {
            System.out.printf("%s is the winner with a total cost of %.2f and %d hours \n", name, cost, hours);

            if (hours < hoursTwo) {
                System.out.printf("Name: %s ", name);
                System.out.printf("Cost: %.2f", cost);
                System.out.printf("Hours: %f", hours);
            } else if (hours > hoursTwo) {
                System.out.printf("Name: %s ", nameTwo);
                System.out.printf("Cost: %.2f", costTwo);
                System.out.printf("Hours: %f", hoursTwo);
            } else if (cost == costTwo && hours < hoursTwo) {
                System.out.printf("%s is the winner with a total cost of %.2f and %d hours \n", name, cost, hours);
            }
        }
    }
}
