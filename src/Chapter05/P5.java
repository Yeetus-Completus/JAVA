package Chapter05;

import java.util.Scanner;

/**
 * Displays the number of votes
 *
 * @author George Hartman
 */
public class P5 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String yes = "y";
//        String no = "n";
//        String quit = "q";
        int yCount = 0;
        int nCount = 0;
        int qCount = 0;
        String vote = "";
        do {
            System.out.println("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting");
            vote = input.next().toUpperCase();

            if (vote.equals("Y")) {
                ++yCount;
            } else if (vote.equals("N")) {
                ++nCount;
            } else if (vote.equals("Q")) {
                break;
            } else {
                System.out.print("INVALID CODE! ");
                ++qCount;
            }

        } while (true);
        int total = (yCount + nCount + qCount);
        System.out.println("Yes Counts: " + yCount);
        System.out.println("No Counts: " + nCount);
        System.out.println("Invalid Counts: " + qCount);
        System.out.println("Total Counts: " + total);
    }

}
