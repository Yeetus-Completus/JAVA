package Chapter03;

import java.util.Scanner;
import java.util.Random;

/**
 * Plays a game of Rock Paper Scissors with a computer
 *
 * @author George Hartman
 */
public class C3_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        System.out.print("Scissor (0) Rock (1) Paper (2): ");
        int playersChoice = input.nextInt();
        int n = rand.nextInt(2);

        System.out.println("You chose " + playersChoice);
        System.out.println("The computer is " + n);

        switch (playersChoice) {

            case 0:

                if (n == 0) {
                    System.out.println("Draw");
                } else if (n == 1) {
                    System.out.println("Lose");
                } else if (n == 2) {
                    System.out.println("Win");
                }
                break;
            case 1:

                if (n == 0) {
                    System.out.println("Win");
                } else if (n == 1) {
                    System.out.println("Draw");
                } else if (n == 2) {
                    System.out.println("Lose");
                }
                break;
            case 2:

                if (n == 0) {
                    System.out.println("Lose");
                } else if (n == 1) {
                    System.out.println("Win");
                } else if (n == 2) {
                    System.out.println("Draw");
                }
                break;

        }

    }
}
