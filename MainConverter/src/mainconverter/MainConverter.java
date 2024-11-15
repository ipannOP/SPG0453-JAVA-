/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainconverter;

/**
 *
 * @author Irfan Hakimie
 */
//Task 4
import java.util.Scanner;

public class MainConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Display display = new Display();
        Formula formula = new Formula();

        // Display menu and get user choice
        int choice = display.showMenu();

        // Perform the selected choice
        switch (choice) {
            case 1: //option for temperature
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = formula.celsiusToFahrenheit(celsius);
                System.out.println(celsius + "C = " + fahrenheit + "F");
                break;
            case 2: //option for Length
                System.out.print("Enter distance in meters: ");
                double meters = scanner.nextDouble();
                double kilometers = formula.meterToKilometer(meters);
                System.out.println(meters + " meters = " + kilometers + " kilometers");
                break;
            case 3: //option for Memory
                System.out.print("Enter memory size in megabytes: ");
                double megabytes = scanner.nextDouble();
                double gigabytes = formula.megabytesToGigabytes(megabytes);
                System.out.println(megabytes + " MB = " + gigabytes + " GB");
                break;
            case 4: //option for weight
                System.out.print("Enter weight in kilograms: ");
                double kilograms = scanner.nextDouble();
                double pounds = formula.kilogramToPound(kilograms);
                System.out.println(kilograms + " kg = " + pounds + " lbs");
                break;
            default:
                System.out.println("Invalid option");
        }

        // Terminate program after completed
        System.out.println("Conversion complete. Program terminated.");
    }
}

