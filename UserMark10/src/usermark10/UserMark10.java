/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usermark10;

/**
 *
 * @author Irfan Hakimie
 */
//Task 3
public class UserMark10 {
    public static void main(String[] args) {
        // Create objects for other classes
        InputReceiver inputReceiver = new InputReceiver();
        GradeSetter gradeSetter = new GradeSetter();
        GradeCounter gradeCounter = new GradeCounter();

        // Receive 10 marks from user
        int[] marks = inputReceiver.receiveMarks();

        // Set grades marks
        char[] grades = gradeSetter.setGrades(marks);

        // Count and display the number of each grade
        gradeCounter.countGrades(grades);
    }
}

