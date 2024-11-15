/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salesman;
import java.util.Scanner;

public class SalesMan {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // base salary
        final double baseSalary = 600.00;
        // Commission rate
        final double commissionRate = 0.05;

        // Prices items
        final double priceMouse = 30.00;
        final double priceKeyboard = 150.00;
        final double priceHeadphone = 70.00;

        //declare variable
        String[] items = {"Mouse", "Keyboard", "Headphone"};
        // Array to hold the prices of the items
        double[] prices = {priceMouse, priceKeyboard, priceHeadphone};

        double totalSales = 0.0;

        // Loop of item and ask for quantity sold
        for (int i = 0; i < items.length; i++) {
            System.out.print("Enter the quantity sold for " + items[i] + " (RM" + (prices[i]) + " each): ");
            int quantitySold = read.nextInt();
            totalSales += quantitySold * prices[i]; // Calculate total sales for the item
        }

        // Calculate the commission
        double commission = totalSales * commissionRate;
        // Calculate total earnings
        double totalEarnings = baseSalary + commission;

        // Display results
        System.out.println("\nTotal sales for the week: " +(totalSales));
        System.out.println("Sales commission (5%): " + (commission));
        System.out.println("Total earnings for the week: " + (totalEarnings));

        read.close();
    }
}




