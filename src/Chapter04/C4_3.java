package Chapter04;

import java.util.Scanner;

/**
 * Compares two employees
 *
 * @author George Hartman
 */
public class C4_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask name
        System.out.print("Enter employee's name: ");

        String name = input.next();

        //Ask hours
        System.out.print("Enter number of hours worked in a week: ");

        int hours = input.nextInt();
//Ask price
        System.out.print("Enter hourly pay rate: $");

        float rate = input.nextFloat();

        System.out.print("Enter federal tax withholding rate: ");
        float gross = (rate * hours);
        double fed = (input.nextDouble() * 100);
        double fedTwo = ((fed * gross) / 100);

        //Ask tax witheld state
        System.out.print("Enter state tax withholding rate: ");

        double state = (input.nextDouble() * 100);

        double stateTwo = ((state * gross) / 100);

        double total = (fedTwo + stateTwo);
        double net = (gross - total);

        System.out.println("Employee's name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay rate: $" + rate);
        System.out.printf("Gross pay: %.2f", gross);
        System.out.println("Deductions: ");
        System.out.printf("    Federal Withholding (%.2f): $%.2f\n", fed, fedTwo);
        System.out.printf("    State Withholding (%.2f): $%.2f\n", state, stateTwo);
        System.out.printf("    Total Deduction: $%.2f\n", total);
        System.out.printf("Net pay: $ %.2f\n", net);
    }
}
