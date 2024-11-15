import java.util.Scanner;

public class PriceCalculator {

    public static void main(String[] args) {
        // Declare variables
        String itemName;
        double price, discountRate, totalPrice, discountAmount, priceAfterDiscount;
        int quantity;

        // Create Scanner object for input
        Scanner read = new Scanner(System.in);

        // Input: Read item name
        System.out.print("Enter the item name: ");
        itemName = read.nextLine();

        // Input: Read price of the item
        System.out.print("Enter the price of the item: ");
        price = read.nextDouble();

        // Input: Read quantity of the item
        System.out.print("Enter the quantity of the item: ");
        quantity = read.nextInt();

        // Input: Read discount rate
        System.out.print("Enter the discount rate (in percentage): ");
        discountRate = read.nextDouble();

        // Calculate total price before discount
        totalPrice = price * quantity;

        // Calculate discount amount
        discountAmount = totalPrice * (discountRate / 100);

        // Calculate price after discount
        priceAfterDiscount = totalPrice - discountAmount;

        // Output: Display the item details and calculated prices
        System.out.println("\nItem Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price After Discount: $" + priceAfterDiscount);

        // Close Scanner
        read.close();
    }
}


