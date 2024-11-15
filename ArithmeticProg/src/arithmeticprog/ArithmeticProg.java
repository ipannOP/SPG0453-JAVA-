/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticprog;

/**
 *
 * @author Irfan Hakimie
 */
import java.util.Scanner;

public class ArithmeticProg {

    public static void main(String[] args) {
        int num1, num2;
       Scanner read = new Scanner(System.in);
        

        // Read first integer
        System.out.print("Enter first integer: ");
        num1 = read.nextInt();

        // Read second integer
        System.out.print("Enter second integer: ");
        num2 = read.nextInt();

        // Perform and print the results of arithmetic operations
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // Increment and decrement operations
        System.out.println("Increment num1: " + (++num1));
        System.out.println("Decrement num2: " + (--num2));

        read.close();
    }
}


