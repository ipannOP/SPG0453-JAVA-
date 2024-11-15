/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usermark10;

/**
 *
 * @author Irfan Hakimie
 */
public class GradeSetter {
    public char[] setGrades(int[] marks) {
        char[] grades = new char[10];

        // Loop to set the grade for each mark
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 90) {
                grades[i] = 'A';
            } else if (marks[i] >= 80) {
                grades[i] = 'B';
            } else if (marks[i] >= 70) {
                grades[i] = 'C';
            } else if (marks[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'E';
            }
        }

        return grades;
    }
}

