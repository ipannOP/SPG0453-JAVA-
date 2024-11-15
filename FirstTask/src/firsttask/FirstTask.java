/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firsttask;

import java.util.Scanner;

/**
 *
 * @author Irfan Hakimie
 */
public class FirstTask {

    /**
     * @param args the command line arguments
     */
   public static void main (String[]args){
        
        String firstname ,lastname;
        Scanner read = new Scanner(System.in);
        
     System.out.print("Input your first name: ");
        firstname = read.nextLine();
        
        System.out.print("Input your last name: ");
        lastname = read.nextLine();
        
       read.close();
       
       System.out.println("Hello");
     System.out.println(firstname +" "+ lastname);
    
}
}
