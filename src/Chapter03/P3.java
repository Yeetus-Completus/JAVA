package Chapter03;

import java.util.Scanner;

/**
 * Displays relations between two numbers
 *
 * @author George Hartman
 */
public class P3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");

        double firstNumber = input.nextDouble();
        System.out.print("Enter your second number: ");
        double secondNumber = input.nextDouble();

        if (firstNumber < secondNumber) {
            System.out.println("The first number is less than the second number");
        }

        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second");
        }

        if (firstNumber == secondNumber) {
            System.out.println("The first number is equal to the second");
        }

        if (firstNumber <= secondNumber) {
            System.out.println("The first number is less than or equal to the second number");

        }

        if (firstNumber != secondNumber) {
            System.out.println("The first number is not equal to the second number");

        }
        if (secondNumber == 0) {
            System.out.println("Cannot divide by 0");
        } else if ((firstNumber / secondNumber) < 1) {
            System.out.println("Proper fraction");
        } else {
            System.out.println("Improper fraction");
        }

        if (firstNumber >= 90) {
            System.out.println("A");
        } else if (firstNumber >= 80) {
            System.out.println("B");
        } else if (firstNumber >= 70) {
            System.out.println("C");
        } else if (firstNumber >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (secondNumber >= 1 && secondNumber <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

    }
}
