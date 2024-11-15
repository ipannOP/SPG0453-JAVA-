/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grade;

import java.util.Scanner; //library

public class Grade{ //class name

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); //object=read
        
        // user input
        System.out.print("Enter your mark: ");
        int mark = read.nextInt();
        
        // Determine the grade 
        String grade;
        
        if (mark >= 90) {
            grade = "A+";
        } else if (mark >= 80) {
            grade = "A";
        } else if (mark >= 70) {
            grade = "B";
        } else if (mark >= 60) {
            grade = "C";
        } else if (mark >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Display the grade
        System.out.println("Your grade is: " + grade);
        
        read.close();
    }
}

