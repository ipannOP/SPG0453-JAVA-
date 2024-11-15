/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passsystem;
import java.util.Scanner;
public class PassSystem {
    public static void main(String[] args) {
        int MaxAttempt = 3; 
        int  Attempts = 0;
        String InputPassword,CorrectPassword = "gmi123";
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        
        while (Attempts < MaxAttempt){
            System.out.print("Please enter your password: ");
            InputPassword = input.nextLine();
            
            if(InputPassword.equals(CorrectPassword)){
                System.out.println("Your are in!");
                break;
            }else{
                System.out.println("Incorrect Password,Please Try Again.");
                Attempts++;
            }
        }
        if (Attempts == MaxAttempt){
            System.out.println("You have reached maximum attempt,Please contact admin");
        }
        input.close();
    }
    
}
