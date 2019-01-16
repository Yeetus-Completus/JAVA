package Chapter07;

import java.util.Scanner;

/**
 * Reads the numbers the user puts them into a array and gives the average
 *
 * @author Jacob Fraley
 */
public class P7 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How mamy numbers will be read?");
        int numberAmount = input.nextInt();
        int numbers[] = new int[numberAmount];
        numberPlacer(numbers);
        double average = average(numbers);
        System.out.println("the average is " + average);
        numberReader(numbers);
    }

    /**
     * Places user numbers numbers in the array
     *
     * @param x = empty array
     */
    public static void numberPlacer(int x[]) {
        Scanner input = new Scanner(System.in);
        for (int counter = 0; counter < x.length; counter++) {
            System.out.print("What is the number");
            int number = input.nextInt();
            x[counter] = number;

        }
    }

    /**
     * Finds the average of the numbers in the array
     *
     * @param x = the filled array
     * @return the average of the numbers in the array
     */
    public static double average(int x[]) {
        double y = 0;
        for (int counter = 0; counter < x.length; counter++) {
            y = y + x[counter];
        }

        return y / x.length;
    }

    /**
     * Prints the numbers
     *
     * @param x = the filled array
     */
    public static void numberReader(int x[]) {

        System.out.println(java.util.Arrays.toString(x));
    }
}
