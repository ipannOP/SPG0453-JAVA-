/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package looping.pkg2;

/**
 *
 * @author Irfan Hakimie
 */

public class Looping2 { //class name
    public static void main(String[] args) { //main method
        // Using for loop
        int sumFor = 0;
        for (int i = 1; i <= 10; i++) {
            sumFor += i;
        }
        System.out.println("Sum using for loop: " + sumFor);

        // Using while loop
        int sumWhile = 0;
        int i = 1;
        while (i <= 10) {
            sumWhile += i;
            i++;
        }
        System.out.println("Sum using while loop: " + sumWhile);

        // Using do-while loop
        int sumDoWhile = 0;
        int j = 1;
        do {
            sumDoWhile += j;
            j++;
        } while (j <= 10);
        System.out.println("Sum using do-while loop: " + sumDoWhile);
    }
}


