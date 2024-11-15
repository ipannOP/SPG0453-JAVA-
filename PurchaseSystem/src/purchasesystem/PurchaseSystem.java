/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purchasesystem;

import java.util.Scanner; //library

public class PurchaseSystem { //class name

    public static void main(String[] args) {
        // Declare variables
        String itemName;
        double itemPrice = 0;
        int quantity;
        double totalCost;
        double discount;
        double finalCost;

        // Initialize Scanner
        Scanner read = new Scanner(System.in); //object=read

        // Display available items
        System.out.println("Available Items:");
        System.out.println("1. Iphone 13 - $3000.00 each");
        System.out.println("2. Iphone 14 - $4100.00 each");
        System.out.println("3. Iphone 15 - $5000.00 each");

        // User selects item
        System.out.print("Enter the item number you want to purchase (1-3): ");
        int itemNumber = read.nextInt();

        // Validate item selection and assign price
        switch (itemNumber) {
            case 1:
                itemName = "Iphone 13";
                itemPrice = 3000.00;
                break;
            case 2:
                itemName = "Iphone 14";
                itemPrice = 4100.00;
                break;
            case 3:
                itemName = "Iphone 15";
                itemPrice = 5000.00;
                break;
            default:
                System.out.println("Invalid item number selected.");
                read.close();
                return; // Exit the program
        }

        // User enters quantity
        System.out.print("Enter the quantity you want to purchase: ");
        quantity = read.nextInt();

        // Calculate total cost
        totalCost = itemPrice * quantity;

        // Apply discount based on quantity
        if (quantity <= 1) {
            discount = 0.1; // 10% discount
        } else if (quantity <= 2) {
            discount = 0.2; // 20% discount
        } else {
            discount = 0.3; // 30% discount
        }

        // Calculate final cost after discount
        finalCost = totalCost - (totalCost * discount);

        // Display order summary
        System.out.println("\nOrder Summary:");
        System.out.println("Item: " + itemName);
        System.out.println("Price per Item: $" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Final Cost After Discount: $" + finalCost);

        // Close the scanner
        read.close();
    }
}

