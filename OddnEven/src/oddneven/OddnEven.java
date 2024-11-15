/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oddneven;

/**
 *
 * @author Irfan Hakimie
 */
public class OddnEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int NoEven=0, NoOdd=0;
        // Loop even numbers 
        System.out.println("Even numbers:");
        for (int i = 0; i <= 10; i= i + 2) {
            System.out.println(i + " is even.");
            NoEven +=i;
        }

        // Loop odd numbers 
        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println(i + " is odd.");
            NoOdd +=i;
        }
        //print out sum dua2
        System.out.println("Sum of Even number is : " + NoEven);
        System.out.println("Sum of Odd number is : " + NoOdd);
        }
    }
