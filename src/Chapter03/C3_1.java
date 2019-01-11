package Chapter03;

import java.util.Scanner;

/**
 * Displays a future date
 *
 * @author George Hartman
 */
public class C3_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int day = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int dayFuture = input.nextInt();

        if (day == 0) {
            System.out.println("Today is Sunday");
        } else if (day == 1) {
            System.out.println("Today is Monday");
        } else if (day == 2) {
            System.out.println("Today is Teusday");
        } else if (day == 3) {
            System.out.println("Today is Wednesday");
        } else if (day == 4) {
            System.out.println("Today is Thursday");
        } else if (day == 5) {
            System.out.println("Today is Friday");
        } else {
            if (day == 6);
            System.out.println("Today is Saturday");
        }
        int elapsedDay = ((day + dayFuture) % 7);

        if (elapsedDay == 0) {
            System.out.println("Future day is Sunday");
        } else if (elapsedDay == 2) {
            System.out.println("Future day is Teusday");
        } else if (elapsedDay == 3) {
            System.out.println("Future day is Wednesday");
        } else if (elapsedDay == 4) {
            System.out.println("Future day is Thursday");
        } else if (elapsedDay == 5) {
            System.out.println("Future day is Friday");
        } else if (elapsedDay == 6) {
            System.out.println("Future day is Saturday");
        } else {
            if (elapsedDay == 1);
            System.out.println("Future day is Monday");
        }
    }
}
