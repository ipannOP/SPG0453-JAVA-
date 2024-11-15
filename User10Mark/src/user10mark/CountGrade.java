/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user10mark;

/**
 *
 * @author Irfan Hakimie
 */
public class CountGrade {
    public int[] calculateGrades(int[] marks, CountGrade countgrade) {
        int[] gradeCounts = new int[5]; // Array to store counts for grades A, B, C, D, E

        for (int mark : marks) {
            if (mark >= GradeSetting.GRADE_A_MIN) {
                gradeCounts[0]++;
            } else if (mark >= GradeSetting.GRADE_B_MIN) {
                gradeCounts[1]++;
            } else if (mark >= GradeSetting.GRADE_C_MIN) {
                gradeCounts[2]++;
            } else if (mark >= GradeSetting.GRADE_D_MIN) {
                gradeCounts[3]++;
            } else if (mark <= GradeSetting.GRADE_E_MAX) {
                gradeCounts[4]++;
            }
        }

        return gradeCounts;
    }
}

