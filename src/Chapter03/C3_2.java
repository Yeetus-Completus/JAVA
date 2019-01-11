package Chapter03;

import java.util.Scanner;

/**
 * Displays if a number is a palindrome
 *
 * @author George Hartman
 */
public class C3_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;

        System.out.print("Enter a three digit number: ");
        int numb = input.nextInt();

        n1 = numb / 100;
        n2 = numb % 10;

        if (n1 == n2) {

            System.out.print("The number is a palindrome.");
        } else {
            if (n1 != n2) {

                System.out.println("The number is not a palindrome.");

            }

        }
    }
}
