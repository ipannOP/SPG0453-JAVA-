/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialiterative;

/**
 *
 * @author Irfan Hakimie
 */
import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean continueProgram = true;
//show instruction 
        while (continueProgram) {
            System.out.print("Enter a non-negative integer to calculate its factorial: ");
            //outer loop
            if (read.hasNextInt()) {
                int n = read.nextInt();
            //inner loop
                if (n < 0) {
                    System.out.println("Negative numbers are not allowed. Program will terminate.");
                    break;
                }

                long factorial = 1;
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }
            //print output
                System.out.println(n + "! = " + factorial);

                // Ask if the user wants to calculate another factorial but accept integer data type only
                System.out.print("Do you want to calculate another factorial? Enter 1 to continue or any other integer to exit: ");
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

