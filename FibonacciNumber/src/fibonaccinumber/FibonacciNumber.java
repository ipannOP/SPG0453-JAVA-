/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccinumber;

/**
 *
 * @author Irfan Hakimie
 */
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean continueProgram = true;
//show instruction before user enter input
        while (continueProgram) {
            System.out.print("Enter a non-negative integer to generate Fibonacci series: ");
            if (read.hasNextInt()) {
                int n = read.nextInt();

                if (n < 0) {
                    System.out.println("Negative numbers are not allowed. Program will terminate.");
                    break;
                }

                // Display Fibonacci series
                System.out.print("Fibonacci series up to " + n + ": ");
                int a = 0, b = 1;
                System.out.print(a);
                
                for (int i = 1; i < n; i++) {
                    System.out.print(", " + b);
                    int next = a + b;
                    a = b;
                    b = next;
                }
                System.out.println();

                // Ask if the user wants to continue
                System.out.print("Do you want to generate another Fibonacci series? Enter 1 to continue or any other integer to exit: ");
                int choice = read.nextInt();
                if (choice != 1) {
                    continueProgram = false;
                }
            } else {
                System.out.println("Invalid input. Program will terminate.");
                break;
            }
        }

        System.out.println("Program terminated.");
        read.close();
    }
}
