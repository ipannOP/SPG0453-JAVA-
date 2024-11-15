/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author Irfan Hakimie
 */
public class Factorial {
    public static void main(String[] args) {
        //preset value /adjust sini value
        int n = 5; // 
        long factorial = 1;

        // Displaying the calculation 
        System.out.print(n + "! = ");
        for (int i = n; i > 0; i--) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + " * ");
            }
            factorial *= i;
        }

        // Display the final result
        System.out.println(" or ");

        System.out.print("1");
        for (int i = 2; i <= n; i++) {
            System.out.print(" * " + i);
        }

        System.out.println(" = " + factorial);
    }
}



