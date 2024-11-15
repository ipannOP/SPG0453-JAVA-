/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minmax;

/**
 *
 * @author Irfan Hakimie
 */
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String choice;

        do {
            // user input 3 integer
            System.out.println("Enter the first integer: ");
            int num1 = read.nextInt();
            System.out.println("Enter the second integer: ");
            int num2 = read.nextInt();
            System.out.println("Enter the third integer: ");
            int num3 = read.nextInt();

            // Find maximum and minimum using Math class
            int max = Math.max(num1, Math.max(num2, num3));
            int min = Math.min(num1, Math.min(num2, num3));

            // Display results
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);

            // Ask if user wants to continue
            System.out.println("Do you want to continue? (yes/no): ");
            choice = read.next();

        } while (choice.equals("yes"));

        System.out.println("Program ended.");
        read.close();
    }
}

