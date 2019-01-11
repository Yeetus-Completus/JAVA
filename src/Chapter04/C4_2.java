package Chapter04;

import java.util.Scanner;

/**
 * Tells if a string is a substring of another
 *
 * @author George Hartman
 */
public class C4_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String characters = input.next().toUpperCase();

        System.out.print("Enter string s2: ");
        String small = input.next().toUpperCase();

        if (characters.contains(small)) {

            System.out.println(small + " is a subsrting of " + characters);

        } else {
            System.out.println(small + " is not a subsrting of " + characters);
        }

    }

}
