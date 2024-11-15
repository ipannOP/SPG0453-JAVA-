/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticoperation;
import java.util.Scanner; //library

public class ArithmeticOperation { //class name

    public static void main(String[] args) {
        
        // Declare variables
        float num1;
        float num2;
        int operator;
        float result = 0;
        
        Scanner read = new Scanner(System.in); //object=read
        
        // User chooses operator
        System.out.println("Choose your preferred operator by entering the corresponding number:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (x)");
        System.out.println("4. Division (/)");
        operator = read.nextInt();
        
        // Read first integer
        System.out.println("Enter first integer:");
        num1 = read.nextFloat();
        
        // Read second integer
        System.out.println("Enter second integer:");
        num2 = read.nextFloat();
        read.close();
        
        // Calculate result based on chosen operator
        switch (operator) {
            case 1:
                result = num1 + num2;
                System.out.println("Your answer is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Your answer is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Your answer is: " + result);
                break;
            case 4:
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Your answer is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator number.");
                break;
        }
    }         
}
