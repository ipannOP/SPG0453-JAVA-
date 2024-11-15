/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agecalculator;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        int currentyear, birthyear;
        Scanner read = new Scanner(System.in);
        
        //Read the current year
        System.out.print("Enter the current year: ");
        currentyear = read.nextInt();
        
        //Read the birth year
        System.out.print("Enter your birth year: ");
         birthyear = read.nextInt();
        
       System.out.println("Your Age: " + (currentyear - birthyear));
        
               
        
        read.close();
    }
}


