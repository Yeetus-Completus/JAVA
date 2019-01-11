package Chapter05;

import java.util.Scanner;

/**
 * Tells the number of positive and negative numbers in a set
 *
 * @author George Hartman
 */
public class C5_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int plus = 0;
        int neg = 0;
        double total = 0;
        System.out.println("Enter an integer, the input ends if it is 0: ");
        do {

            int egers = input.nextInt();
            if (egers > 0) {
                plus += 1;

            } else if (egers == 0) {
                break;
            } else if (egers < 0) {
                neg += 1;
            }
            total = total + egers;

        } while (true);

        if ((plus + neg) == 0) {
            System.out.println("No numbers are entered except 0");
        }
        if ((plus + neg) > 0) {
            System.out.println("The number of positives is " + plus);
            System.out.println("The number of negatives is " + neg);
            System.out.println("The total is " + total);
            System.out.println("The average is " + (total / (plus + neg)));

        }
    }

}
