/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordsystem;

/**
 *
 * @author Irfan Hakimie
 */

   import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        // Predefined password
        final String correctPassword = "123";
        // Maximum number of allowed attempts
        final int maxAttempts = 3;
        int attempts = 0;
        boolean accessGranted = false;

        Scanner scanner = new Scanner(System.in);

        // Loop until the user either gets the password correct or exceeds the max attempts
        while (attempts < maxAttempts && !accessGranted) {
            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();
            attempts++;

            if (inputPassword.equals(correctPassword)) {
                accessGranted = true;
                System.out.println("Access granted. Welcome!");
            } else {
                if (attempts < maxAttempts) {
                    System.out.println("Incorrect password. Try again.");
                } else {
                    System.out.println("Incorrect password. You have exceeded the maximum number of attempts.");
                }
            }
        }

        if (!accessGranted) {
            System.out.println("Access denied. Please contact support.");
        }

        scanner.close();
    }
}

    
