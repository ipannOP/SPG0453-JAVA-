/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compoundprog;

public class CompoundProg {

    public static void main(String[] args) {
        int x = 10;

        // Demonstrating pre-increment
        System.out.println("Initial value of x: " + x);
        System.out.println("Pre-increment (++x): " + (++x)); // x is incremented before being used
        System.out.println("Value of x after pre-increment: " + x);

        // Reset x for next demonstration
        x = 10;

        // Demonstrating post-increment
        System.out.println("\nInitial value of x: " + x);
        System.out.println("Post-increment (x++): " + (x++)); // x is used before being incremented
        System.out.println("Value of x after post-increment: " + x);

        // Reset x for next demonstration
        x = 10;

        // Demonstrating pre-decrement
        System.out.println("\nInitial value of x: " + x);
        System.out.println("Pre-decrement (--x): " + (--x)); // x is decremented before being used
        System.out.println("Value of x after pre-decrement: " + x);

        // Reset x for next demonstration
        x = 10;

        // Demonstrating post-decrement
        System.out.println("\nInitial value of x: " + x);
        System.out.println("Post-decrement (x--): " + (x--)); // x is used before being decremented
        System.out.println("Value of x after post-decrement: " + x);
    }
}

