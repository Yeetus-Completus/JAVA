package Chapter07;

import java.util.*;

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
        ArrayList<Integer> numbers = new ArrayList<>(numberAmount);
        numberPlacer(numbers, numberAmount);
        double average = average(numbers);
        System.out.println("the average is " + average);
        numberReader(numbers);
    }

    /**
     * Places user numbers numbers in the array
     *
     * @param x = empty array
     * @param y = the capacity of the array list
     */
    public static void numberPlacer(ArrayList<Integer> x, int y) {
        Scanner input = new Scanner(System.in);
        for (int counter = 0; counter < y; counter++) {
            System.out.print("What is the number");
            int number = input.nextInt();
            x.add(counter, number);

        }
    }

    /**
     * Finds the average of the numbers in the array
     *
     * @param x = the filled array
     * @return the average of the numbers in the array
     */
    public static double average(ArrayList<Integer> x) {
        double y = 0;
        for (int counter = 0; counter < x.size(); counter++) {
            y = y + x.get(counter);
        }

        return y / x.size();
    }

    /**
     * Prints the numbers
     *
     * @param x = the filled array
     */
    public static void numberReader(ArrayList<Integer> x) {
        System.out.println(x);
    }
}
