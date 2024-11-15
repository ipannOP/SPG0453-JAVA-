/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minmaxmethod;

/**
 *
 * @author Irfan Hakimie
 */
//Task 1 main method
import java.util.Scanner;
public class MinMaxMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            // Input 3 integers
            System.out.println("Enter the first integer: ");
            int num1 = input.nextInt();
            System.out.println("Enter the second integer: ");
            int num2 = input.nextInt();
            System.out.println("Enter the third integer: ");
            int num3 = input.nextInt();

            // Create instances of MaxValue and MinValue classes
            Max max = new Max();
            Min min = new Min();

            // Call methods to find max and min values
            int maxValue = max.panggilMax(num1, num2, num3);
            int minValue = min.panggilMin(num1, num2, num3);

            // Display results
            System.out.println("Maximum value: " + maxValue);
            System.out.println("Minimum value: " + minValue);

            // Ask if the user wants to continue
            System.out.println("Do you want to continue? (yes/no): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Program ended.");
        input.close();
    }
}

