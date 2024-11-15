/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifdemo;

import java.util.Scanner;

/**
 *
 * @author Irfan Hakimie
 */
public class IfDemo {

    public static void main(String[] args) {
      int grade;
      int grademarks;
  
      
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Your Grade Marks: ");
        grademarks = read.nextInt();
        grade = grademarks;
        
      if(grade >=60)
          System.out.println("Passed");
      else
          System.out.println("Failed");
   
    }
    
}
