package me.cam.backwards;

import java.util.Scanner;

/**
 * Author: Cameron Janssen
 * Acknowledgements: None
 * Purpose: Takes in and reverses
 * the order of characters in a string
 */
public class Backwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Makes sure the user input is more than 3 characters
        while (input.length() < 4) {
            System.out.println("Please enter a string more than 3 characters: ");
            input = scanner.nextLine();
        }

        // Pre-defining a new array that will hold the reversed string in a list of characters
        char[] reversed = new char[input.length()];

        /*
        This iterates through the user inputted string
        and works backwards, taking the last, then second-last
        then third-last characters and adding them to the new
        array. Last -> first,  Second-Last -> Second (etc.)
         */
        for (int i = 0; i < input.length(); i++) {
            reversed[i] = input.charAt(input.length() - i - 1);
        }

        // Compiles the array into a string and prints it back to the user.
        System.out.println(String.valueOf(reversed));
    }
}