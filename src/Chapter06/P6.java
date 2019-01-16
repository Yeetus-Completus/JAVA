package Chapter06;

import java.util.Scanner;

/**
 * Displays currency conversion rate
 *
 * @author George Hartman
 */
public class P6 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Euro Rate: ");
        double payment = input.nextDouble();
        System.out.println("Pound Sterlings Rate: ");
        double payment2 = input.nextDouble();
        System.out.println("Yens Rate: ");
        double payment3 = input.nextDouble();

        String popTheQuestion = "";
        do {
            System.out.print("Please enter the number of dollars you want to convert: $");
            double dollars = input.nextDouble();

            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            String internationalCurry = input.next().toUpperCase();

            switch (internationalCurry) {
                case "E":
                    System.out.printf("%.2f dollars = %.2f Euros\n", dollars, convert(dollars, payment));
                    break;

                case "P":
                    System.out.printf("%.2f dollars = %.2f Pounds\n", dollars, convert(dollars, payment2));
                    break;

                case "Y":
                    System.out.printf("%.2f dollars = %.2f Yen\n", dollars, convert(dollars, payment3));
                    break;
            }

            do {
                System.out.println("Are there more conversions to perform?");
                popTheQuestion = input.next();
            } while (!popTheQuestion.equalsIgnoreCase("yes") && !popTheQuestion.equalsIgnoreCase("no"));

        } while (popTheQuestion.equalsIgnoreCase("yes"));
    }

    /**
     * Conversion Method
     *
     * @param dollars gets its value changed
     * @param exchangeRate changes the value of dollars
     * @return new value of dollars
     */
    public static double convert(double dollars, double exchangeRate) {

        if (dollars > 100) {
            return (0.95 * dollars * exchangeRate);
        } else {
            return (0.90 * dollars * exchangeRate);
        }

    }

}
