/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainconverter;

/**
 *
 * @author Irfan Hakimie
 */
import java.util.Scanner;

public class Display { 
    public int showMenu() {
        Scanner read = new Scanner(System.in);
        //Selection menu 
       //show to user
        System.out.println("Choose a conversion type:");
        System.out.println("1. Temperature (Celsius to Fahrenheit)");
        System.out.println("2. Length (Meter to Kilometer)");
        System.out.println("3. Memory (Megabytes to Gigabytes)");
        System.out.println("4. Weight (Kilogram to Pound)");
        System.out.print("Enter your choice (1-4): ");
        
        return read.nextInt();
    }
}

