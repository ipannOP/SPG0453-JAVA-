/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package returnexample;

/**
 *
 * @author Irfan Hakimie
 */
public class ReturnExample {

    public static void main(String[] args) {
        int result;
        for (int i = 1; i <= 10; i++) {
            result = square(i); //method
            System.out.println("The square of " + i + " is = " + result + "\n");
        }
    }

    public static int square(int y) { //method parameter
        return y * y; // return square of y
    }
}

    
