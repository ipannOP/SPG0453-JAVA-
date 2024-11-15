/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usermark10;

/**
 *
 * @author Irfan Hakimie
 */
import java.util.Scanner;

public class InputReceiver {
    public int[] receiveMarks() {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[10];

        // Loop to receive 10 marks from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + " (0-100): ");
            marks[i] = scanner.nextInt();
        }

        return marks;
    }
}

