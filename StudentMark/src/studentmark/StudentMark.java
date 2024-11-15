/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmark;

import java.util.Scanner;

public class StudentMark {

    public static void main(String[] args) {
        // Declare variables
        String name, ID, subject;
        int test1Mark, test2Mark;
        
        // Create Scanner object for input
        Scanner read = new Scanner(System.in);
        
        // Input: Read student's name
        System.out.print("Enter your name: ");
        name = read.nextLine();
        
        // Input: Read student's ID
        System.out.print("Enter your ID: ");
        ID = read.nextLine();
        
        // Input: Read subject
        System.out.print("Enter your subject: ");
        subject = read.nextLine();
        
        // Input: Read marks for Test1
        System.out.print("Enter your marks for Test1 (out of 100): ");
        test1Mark = read.nextInt();
        
        // Input: Read marks for Test2
        System.out.print("Enter your marks for Test2 (out of 100): ");
        test2Mark = read.nextInt();
        
        // Calculate average mark
        double averageMark = (test1Mark + test2Mark) / 2.0;
        
        // Output: Display the student's details and average mark
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Subject: " + subject);
        System.out.printf("Average Mark: %.2f%n", averageMark);
        
        // Close Scanner
        read.close();
    }
}



