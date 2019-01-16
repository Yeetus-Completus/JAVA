package Chapter07;

import java.util.Scanner;

/**
 * Creates array of student test scores based on user input, determines grades
 * and highest score
 *
 * @author Sean Knoke
 */
public class C7_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create the array
        System.out.print("Enter the number of students: ");
        int[] scores = new int[input.nextInt()];

        // Fill array with scores
        System.out.print("Enter " + scores.length + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        // Determine the highest score
        int highestScore = bestScore(scores);

        // Display output
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + determineGrade(scores[i], highestScore));
        }
    }

    /**
     * Determines the best score
     *
     * @param scores integer scores inputed into an array
     * @return best
     */
    public static int bestScore(int[] scores) {
        int best = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > best) {
                best = scores[i];
            }
        }

        return best;
    }

    /**
     * Determines the grade of score
     *
     * @param score integer thats an individual score
     * @param best integer used to determine grade
     * @return Grade
     */
    public static char determineGrade(int score, int best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
