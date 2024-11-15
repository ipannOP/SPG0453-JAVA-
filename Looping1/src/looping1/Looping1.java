/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package looping1;

/**
 *
 * @author Irfan Hakimie
 */

public class Looping1 {
    public static void main(String[] args) {
        // for loop
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n"); 

        // while loop
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n"); 

        //do-while loop
        System.out.println("Using do-while loop:");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println(); 
    }
}


  


