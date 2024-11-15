/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package powerof2;

/**
 *
 * @author Irfan Hakimie
 */
public class PowerOf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize variable to store the sum of squares
        int sumOfSquares = 0;
        

        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int square = i * i; // Calculate the square of the number
            System.out.println("The square of " + i + " is " + square);
            sumOfSquares += square; // Add the square to the sum
        }

        // Display the sum of squares
        System.out.println("\nThe sum of squares from 1 to 10 is: " + sumOfSquares);
    }
}

