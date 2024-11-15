/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method;

/**
 *
 * @author Irfan Hakimie
 */
public class Method {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        double number1 = 3;
        double number2 = 5;
        double number3 = 7;

        double max = maximum(number1, number2, number3);
        System.out.println(max);
    }

   
    public static double maximum(double x, double y, double z) {
        return Math.max(x, Math.max(y, z));
    }
}


