/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kis;

/**
 *
 * @author Irfan Hakimie
 */

import java.util.Scanner;

//class name
public class KIS {
   
    public static void main(String[] args) {
    
        //declare variable
        int latenumber;
        float deductmarks = 0.3f;
        float totalKISmark = 0;
        float KISbalance = 0;
        
        //read input
        Scanner read = new Scanner(System.in);

        //user input
        System.out.print("Enter the number of times you were late: ");
        latenumber = read.nextInt();

        //calculate total KIS mark if it greater or equal to 3
        if (latenumber >= 3) {
            totalKISmark = latenumber * deductmarks;
            KISbalance = 10 - totalKISmark;
        }

        // Print the total KIS mark
        System.out.println("Total KIS Mark: " + totalKISmark);
        System.out.println("KIS mark Balance:"+ KISbalance);

        // Close the scanner
        read.close();
    }
}



