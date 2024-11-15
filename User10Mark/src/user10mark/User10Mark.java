/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package user10mark;

/**
 *
 * @author Irfan Hakimie
 */
public class User10Mark {

    public static void main(String[] args) {
        // Create instances of the other classes
        InputMarks inputMarks = new InputMarks();
        GradeSetting gradeSetting = new GradeSetting();
        GradeCounting gradeCounting = new GradeCounting();
        
        // Receive marks from the user
        int[] marks = inputMarks.getMarks();

        // Calculate grades and count each grade
        int[] gradeCounts = gradeCounting.calculateGrades(marks, gradeSetting);

        // Display results
        System.out.println("Out of 10:");
        System.out.println("Grade A: " + gradeCounts[0]);
        System.out.println("Grade B: " + gradeCounts[1]);
        System.out.println("Grade C: " + gradeCounts[2]);
        System.out.println("Grade D: " + gradeCounts[3]);
        System.out.println("Grade E: " + gradeCounts[4]);
    }
}}

