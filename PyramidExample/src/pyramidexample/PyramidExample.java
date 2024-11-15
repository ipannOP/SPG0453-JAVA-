/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pyramidexample;

/**
 *
 * @author Irfan Hakimie
 */

public class PyramidExample {
/*
    public static void main(String[] args) {
    
for(int i=1;i<=5;i++){  
for(int j=1;j<=i;j++){  
        System.out.print("* ");  
}  
System.out.println();//new line  
}  
}  
}  
    */
    /*
public static void main (String[] args){
int term=6;  
for(int i=1;i<=term;i++){  
for(int j=term;j>=i;j--){  
        System.out.print("* ");  
}  
System.out.println();//new line  
}  
}}

    */
    

    public static void main(String[] args) {
        int height = 5; // Height of the letters 'I' and 'H'

        for (int i = 1; i <= height; i++) {
            // Print the letter 'I'
            for (int j = 1; j <= height; j++) {
                if (i == 1 || i == height) {
                    // Top and bottom bars of 'I'
                    System.out.print("$ ");
                } else if (j == height / 2 + 1) {
                    // Middle part of 'I'
                    System.out.print("$ ");
                } else {
                    System.out.print("  "); // Spaces for the sides
                }
            }

            System.out.print("   "); // Space between 'I' and 'H'

            // Print the letter 'H'
            for (int j = 1; j <= height; j++) {
                if (j == 1 || j == height || i == height / 2 + 1) {
                    // Two sides of 'H' and the middle bar
                    System.out.print("$ ");
                } else {
                    System.out.print("  "); // Spaces between the sides
                }
            }

            System.out.println(); // New line after each row
        }
    }
}


