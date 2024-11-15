/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discount;

import java.util.Scanner; //library

public class Discount { //class name

    public static void main(String[] args) {
        // Declare variables
        String itemName;
        double pricePerItem;
        int quantity;
        String colorCode;
        double discountRate = 0;
        double totalPrice;
        double discountAmount;
        double priceAfterDiscount;
        
        Scanner read = new Scanner(System.in); //object=read
        
        // User enters item name
        System.out.print("Enter the item name: ");
        itemName = read.nextLine();
        
        // User enters item price
        System.out.print("Enter the price per item: ");
        pricePerItem = read.nextDouble();
        
        // User enters item quantity
        System.out.print("Enter the quantity: ");
        quantity = read.nextInt();
        
        // Display discount menu
        System.out.println("Choose the discount rate by color code:");
        System.out.println("Red: 10%");
        System.out.println("Blue: 15%");
        System.out.println("Green: 20%");
        System.out.println("Yellow: 25%");
        System.out.println("Enter the color code (Red, Blue, Green, Yellow):");
        read.nextLine(); 
        colorCode = read.nextLine();
        
        // Determine discount rate based on color code
        if (colorCode.equalsIgnoreCase("Red")) {
            discountRate = 0.10;
        } else if (colorCode.equalsIgnoreCase("Blue")) {
            discountRate = 0.15;
        } else if (colorCode.equalsIgnoreCase("Green")) {
            discountRate = 0.20;
        } else if (colorCode.equalsIgnoreCase("Yellow")) {
            discountRate = 0.25;
        } else {
            System.out.println("Invalid color code. No discount applied.");
        }
        
        // Calculate total price, discount amount, and price after discount
        totalPrice = pricePerItem * quantity;
        discountAmount = totalPrice * discountRate;
        priceAfterDiscount = totalPrice - discountAmount;
        
        // Display the result
        System.out.println("\nItem Name: " + itemName);
        System.out.println("Price per Item: $" + pricePerItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Price After Discount: $" + priceAfterDiscount);
        
        read.close();
    }
}


