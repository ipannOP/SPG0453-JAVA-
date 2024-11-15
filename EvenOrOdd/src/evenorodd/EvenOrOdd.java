/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenorodd;

/**
 *
 * @author Irfan Hakimie
 */
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String continueResponse;

        do {
            int evenCount = 0;
            int oddCount = 0;

            System.out.println("Enter integers (type 'done' to finish the sequence):");

            // Read integers from user
            while (read.hasNext()) {
                String input = read.next();

                // Check if user wants to finish the input
                if (input.equalsIgnoreCase("done")) {
                    break;
                }

                // Validate if the input is a valid integer
                if (isInteger(input)) {
                    int number = Integer.parseInt(input);

                    // Count even or odd
                    if (number % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                }
            }

            // Display the counts
            System.out.println("Number of even integers: " + evenCount);
            System.out.println("Number of odd integers: " + oddCount);

            // Prompt user to continue or exit
            System.out.print("Do you want to enter another sequence? (yes/no): ");
            continueResponse = read.next();

            // Clear the scanner buffer
            read.nextLine(); 

        } while (continueResponse.equalsIgnoreCase("yes"));

        System.out.println("Program terminated.");
        read.close();
    }

    // Method to check if the input is a valid integer
    private static boolean isInteger(String input) {
        // Check if input matches integer pattern
        return input.matches("-?\\d+");
    }
}


