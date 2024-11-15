/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementmethod;
/**
 *
 * @author Irfan Hakimie
 */
//Task 2 
import java.util.Scanner;

public class Result {
    // Implement'lihat' method
    public void lihat() {
        int studentpass = 0, studentfail = 0, numberofstudents;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        numberofstudents = input.nextInt();

        for (int i = 1; i <= numberofstudents; i++) {
            System.out.print("Enter score for student " + i + " (0-100): ");
            int score = input.nextInt();

            if (score >= 35) {
                studentpass++;
            } else {
                studentfail++;
            }
        }

        System.out.println("Total students who passed: " + studentpass);
        System.out.println("Total students who failed: " + studentfail);

        if (studentpass > (numberofstudents / 2)) {
            System.out.println("Bonus to Instructor");
        } else {
            System.out.println("No Bonus to Instructor");
        }
    }
}


    

