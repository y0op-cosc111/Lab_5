package me.cam.pyramid;

import java.util.Scanner;

/**
 * Author: Cameron Janssen
 * Acknowledgements: None
 * Purpose: Makes a pyramid!
 */
public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input
        System.out.println("Input a number between 1 and 9 (inclusive):");
        int count = scanner.nextInt();

        // Verify input
        while (count < 1 || count > 9) {
            System.out.println("Input a number between 1 and 9 (inclusive):");
            count = scanner.nextInt();
        }

        // idk, requirements said to do this so here, i guess:
        int num = count;
        
        /*
        Here's the way following the guidelines for the lab.
        This works but it is ***incredibly*** inefficient.
         */
        for (int i = 0; i < num; i++) {

            // Using a string builder I can append to it each time instead of modifying a printed string.
            StringBuilder toPrint = new StringBuilder();

            /*
            Will print " " as many times as num-(i+1)

            The faster way would be: toPrint.append(" ".repeat(num - i - 1));
            */
            for (int j = 0; j < num-i-1; j++) {
                toPrint.append(" ");
            }

            // This adds the first digit in the row: 1, 2, 3, 4
            toPrint.append(i + 1);

            // This fills in the first half of the pyramid by counting down from the first digit in the row
            for (int j = 0; j < i; j++) {
                toPrint.append(i-j);
            }


            // This adds the second half of the pyramid
            for (int j = 0; j < i; j++) {
                toPrint.append(j+2);
            }
            System.out.println(toPrint.toString());
        }
    }
}