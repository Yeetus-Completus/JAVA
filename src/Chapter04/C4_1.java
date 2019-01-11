package Chapter04;

import java.util.Scanner;

/**
 * Displays college degree
 *
 * @author George Hartman
 */
public class C4_1 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String character;
        String college = null;
        String year = null;

        System.out.print("Enter two characters: ");
        character = input.next().toUpperCase(); // M1
        char first = character.charAt(0);
        char second = character.charAt(1);

        switch (first) {
            case 'M':
                college = ("Mathematics");
                break;
            case 'C':
                college = ("Computer Science");
                break;
            case 'I':
                college = ("Information Technology");
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;

        }
        switch (second) {
            case '1':
                year = ("Freshman");
                break;
            case '2':
                year = ("Sophmore");
                break;
            case '3':
                year = ("Junior");
                break;
            case '4':
                year = ("Senior");
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }
        System.out.println(college + " " + year);
    }
}
