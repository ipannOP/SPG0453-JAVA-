/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        // Declare variables
        double weight, height, bmi;
        String category;

        // Create Scanner object for input
        Scanner read = new Scanner(System.in);

        // Input: Read weight in kilograms
        System.out.print("Enter your weight (in kilograms): ");
        weight = read.nextDouble();

        // Input: Read height in meters
        System.out.print("Enter your height (in meters): ");
        height = read.nextDouble();

        // Calculate BMI
        bmi = weight / (height * height);

        // Determine BMI category
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obesity";
        }

        // Output: Display the BMI and category
        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("BMI Category: " + category);

        // Close Scanner
        read.close();
    }
}



