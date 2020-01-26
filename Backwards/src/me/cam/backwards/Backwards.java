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

        while (input.length() < 4) {
            System.out.println("Please enter a string more than 3 characters: ");
            input = scanner.nextLine();
        }

        char[] reversed = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            reversed[i] = input.charAt(input.length() - i - 1);
        }

        System.out.println(String.valueOf(reversed));
    }
}