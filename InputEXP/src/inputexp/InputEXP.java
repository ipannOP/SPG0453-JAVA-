/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputexp;

/**
 *
 * @author Irfan Hakimie
 */
import java.util.Scanner;
public class InputEXP {
    
    public static void main (String[]args){
        
        String name;
        int age;
        String studentID;
        Scanner read = new Scanner(System.in);
        
        //Reads a single line from the console
        //and stores into name variable
     System.out.print("Enter your name: ");
        name = read.nextLine();
        
        //Reads a integer from the console
        //and stores into age variable
System.out.print("Enter your age: ");
       age=read.nextInt();
       
       //panggil library baca string
       read.nextLine();
       
       System.out.print("Enter your student ID :");
       studentID =read.nextLine();
      
       
       
        read.close();
        
        //Prints name and age to the console
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Student ID: " +studentID);
        
        
        
         }}




