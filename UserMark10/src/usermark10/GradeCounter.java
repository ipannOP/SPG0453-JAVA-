/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usermark10;

/**
 *
 * @author Irfan Hakimie
 */
public class GradeCounter {
    public void countGrades(char[] grades) {
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0;

        // Loop to count the number of each grade
        for (char grade : grades) {
            switch (grade) {
                case 'A':
                    countA++;
                    break;
                case 'B':
                    countB++;
                    break;
                case 'C':
                    countC++;
                    break;
                case 'D':
                    countD++;
                    break;
                case 'E':
                    countE++;
                    break;
            }
        }

        // Display the number of each grade
        System.out.println("Grade A: " + countA);
        System.out.println("Grade B: " + countB);
        System.out.println("Grade C: " + countC);
        System.out.println("Grade D: " + countD);
        System.out.println("Grade E: " + countE);
    }
}

