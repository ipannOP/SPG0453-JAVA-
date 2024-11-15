/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user10mark;

/**
 *
 * @author Irfan Hakimie
 */
import java.util.Scanner;

public class InputMarks {
    public int[] getMarks() {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[10];

        System.out.println("Enter 10 marks (0-100):");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        return marks;
    }
}

