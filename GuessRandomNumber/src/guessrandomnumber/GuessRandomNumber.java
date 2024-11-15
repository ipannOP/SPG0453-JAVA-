/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessrandomnumber;

/**
 *
 * @author Irfan Hakimie
 */
import javax.swing.JOptionPane;

public class GuessRandomNumber {
    public static void main(String[] args) {
        // Step 1: Assign the predefined random number
        int random_number = 4;
        int attempts = 0; // Initialize number of attempts
        int max_attempts = 10;
        int user_guess;

        // Step 2: Implement the do-while loop
        do {
            // Show input dialog to allow user to enter a number
            String userInput = JOptionPane.showInputDialog(null, 
                    "Guess the number (between 1 and 10):\nAttempts remaining: " + (max_attempts - attempts));
            
            // Check if the user clicked 'Cancel' or entered invalid input
            if (userInput == null) {
                JOptionPane.showMessageDialog(null, "Operation Cancelled. Exiting program.");
                break;
            }

            try {
                // Convert input string to an integer
                user_guess = Integer.parseInt(userInput);

                // Step 3: Check if the guess is correct
                if (user_guess == random_number) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You've guessed the correct number.");
                    break; // Exit the loop if correct
                } else {
                    attempts++; // Increment attempt counter if incorrect
                    if (attempts < max_attempts) {
                        JOptionPane.showMessageDialog(null, "Wrong guess! Try again.");
                    }
                }
            } catch (NumberFormatException e) {
                // Handle invalid input
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        } while (attempts < max_attempts);

        // Final message after loop ends
        if (attempts == max_attempts) {
            JOptionPane.showMessageDialog(null, "Sorry! You've reached the maximum attempts. The correct number was " + random_number);
        }
    }
}
